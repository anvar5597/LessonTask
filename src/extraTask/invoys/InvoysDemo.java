package extraTask.invoys;

import java.util.Scanner;

public class InvoysDemo {
    public static Scanner scanner;
    public static User[] users = new User[100];
    public static Invoys[] invoys = new Invoys[100];
    public static User currentUser = null;

    public static void main(String[] args) {

        users[0] = new User("Anvar", "admin", "12345");
        users[1] = new User("Anvar", "anvar", "12345");
        users[2] = new User("Sarvar", "sarvar", "12345");
        invoys[0] = new Invoys("77-01", 2000, false, users[1]);
        invoys[1] = new Invoys("77-02", 2000, false, users[1]);
        invoys[2] = new Invoys("77-03", 2000, false, users[2]);
        invoys[3] = new Invoys("77-04", 2000, false, users[1]);

        BoshEkran:
        while (true) {
            scanner = new Scanner(System.in);
            System.out.println("---------Invoys Demo-----------\n");
            System.out.println("----------Tizimga kirish----------");
            System.out.println("1.Login");
            System.out.println("2.Register");
            System.out.println("3.All Users");
            System.out.println("0.Exit");
            int choose = scanner.nextInt();

            switch (choose) {
                case 1 -> login();
                case 2 -> regstration();
                case 3 -> showAllUsers();
                case 0 -> {
                    break BoshEkran;
                }
                default -> throw new IllegalStateException("Siz notog`ri menyu tanladingiz " + choose);
            }
        }
    }

    private static void showAllUsersForAdmin() {
        for (Invoys invoys1: invoys ) {
            if (invoys1 != null) {
                    System.out.println(invoys1);

            }
        }
        showAdminDashboard();
    }
    private static void showAllUsers() {
        for (User user : users) {
            if (user != null) {
                if (!user.getId().equals(1L)) {
                    System.out.println("Ism: " + user.getName() + " login: " + user.getLogin());
                }
            }
        }
    }

    private static void regstration() {
        scanner = new Scanner(System.in);
        System.out.print("Ismingiz:  ");
        String name = scanner.nextLine();
        System.out.print("Yangi login:  ");
        String login = scanner.next();
        mavjudLoginTekshirish:
        while (true) {
            for (User user : users) {
                if (user != null) {
                    if (user.getLogin().equals(login)) {
                        System.out.println("Bunday login mavjud!\nLogin: ");
                        login = scanner.next();
                    } else {
                        break mavjudLoginTekshirish;
                    }
                }
                break;
            }
        }
        System.out.print("Parolingiz: ");
        String password = scanner.next();
        int cnt = 1;
        for (User user : users) {
            cnt++;
            if (user == null) {
                break;
            }
        }

        users[cnt] = new User(name, login, password);
    }

    private static void login() {
        scanner = new Scanner(System.in);

        System.out.print("login: ");
        String login = scanner.nextLine();
        System.out.print("password: ");
        String password = scanner.nextLine();

        if (chekEmail(login, password)) {
            initCurrentAccount(login);
            if (currentUser.getId().equals(1L)) {
                showAdminDashboard();
            }
            showDashboard();
        } else {
            System.out.println("Something went wrong!");
        }

    }


    private static void showDashboard() {
        System.out.println("------Menu-------");
        System.out.println("1.Invoys orqali to`lash");
        System.out.println("2.Barcha invoyslar");
        System.out.println("0.Log out");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> paidInvoys();
            case 2 -> showInvoys();
            case 0 -> currentUser = null;
            default -> {
                System.out.println("Noto`g`ri so`rov !");
                showDashboard();
            }
        }
    }

    private static void showAdminDashboard() {
        System.out.println("Siz adminsiz!");
        System.out.println("1.Foydalanuvchilar ro`yhati");
        System.out.println("2.Foydalanuvchiga invoys qo`shish");
        System.out.println("3.Foydalanuvchi to`lov summasini o`zgartirish");
        System.out.println("4.Foydalanuvchi invoysini o`chirish");
        System.out.println("0.Chiqish");
        int choose = scanner.nextInt();
        switch (choose) {
            case 1 -> showAllUsersForAdmin();
            case 2 -> addInvoys();
            case 3 -> changeInvoys();
            case 4 -> deleteInvoys();
            case 0 -> currentUser = null;
            default -> {
                System.out.println("Noto`g`ri so`rov !");
                showAdminDashboard();
            }
        }
    }

    private static void deleteInvoys() {
        for (User user : users){
            if(user != null && !user.getId().equals(1L)){
                System.out.println(user.getName());
            }
        }
        System.out.println("Kimning invoysini almashtirmoqchisiz: ");
        String name=scanner.next();
        long id=0;
        for (User user : users){
            if(user != null && !user.getId().equals(1L)){
                if(user.getName().equals(name)){
                    id = user.getId();
                }
            }
        }
        System.out.println("Invoys raqamlar: ");
        for (Invoys invoys1: invoys){
            if(invoys1 != null){
                if (invoys1.getPaidlBy().equals(users[(int) id -1])){
                    System.out.println(invoys1.getId() + " " + invoys1.getInvoysNumber());
                }
            }
        }
        System.out.print("Invoys raqamini tanling: ");
        int choose = scanner.nextInt();
        for (Invoys invoys1: invoys){
            if(invoys1 != null){
                if (invoys1.getInvoysNumber().equals(invoys[choose-1].getInvoysNumber())){
                    invoys1 = null;
                    showAdminDashboard();
                }
            }
        }

    }

    private static void changeInvoys() {
        for (User user : users){
            if(user != null && !user.getId().equals(1L)){
                System.out.println(user.getName());
            }
        }
        System.out.println("Kimning invoysini almashtirmoqchisiz: ");
        String name=scanner.next();
        long id=0;
        for (User user : users){
            if(user != null && !user.getId().equals(1L)){
                if(user.getName().equals(name)){
                    id = user.getId();
                }
            }
        }
        System.out.println("Invoys raqamlar: ");
        for (Invoys invoys1: invoys){
            if(invoys1 != null){
                if (invoys1.getPaidlBy().equals(users[(int) id -1])){
                    System.out.println(invoys1.getId() + " " + invoys1.getInvoysNumber());
                }
            }
        }
        System.out.print("Invoys raqamini tanling: ");
        int choose = scanner.nextInt();
        for (Invoys invoys1: invoys){
            if(invoys1 != null){
                if (invoys1.getInvoysNumber().equals(invoys[choose-1].getInvoysNumber())){
                    System.out.println("Oldingi summa: " + invoys1.getCost());
                    System.out.print("Yangi summani kiriting: ");
                    int newCost = scanner.nextInt();
                    invoys1.setCost(newCost);
                    showAdminDashboard();
                }
            }
        }
        
    }

    private static void showInvoys() {
        int cnt = 0;
        for (Invoys invoys1 : invoys) {
            if (invoys1 != null) {
                if (invoys1.getPaidlBy().getId().equals(currentUser.getId()) && !invoys1.getStatus()) {
                    System.out.println(++cnt + "." + invoys1.getInvoysNumber() + " " + invoys1.getCost());
                } else if (invoys1.getPaidlBy().getId().equals(currentUser.getId()) && invoys1.getStatus()) {
                    System.out.println(++cnt + "." + invoys1.getInvoysNumber() + " to`langan");
                }
            }

        }
        if( cnt == 0){
            System.out.println("Sizda to`lanadigan invoys yo`q!");
        }
        showDashboard();
    }

    private static void paidInvoys() {
        scanner = new Scanner(System.in);
        int countUser = 1;
        for (Invoys invoys1 : invoys) {
            if (invoys1 != null) {
                if (invoys1.getPaidlBy().getId().equals(currentUser.getId()) && !invoys1.getStatus()) {
                    System.out.println(countUser++ + ". " + invoys1.getInvoysNumber() + " " + invoys1.getCost());

                }
            }
        }
        System.out.println("Invoys raqami: ");
        invoysniTekshirish:
        while (true) {
            String invoysNumber = scanner.next();
            for (Invoys invoys1 : invoys) {
                if (invoys1 != null) {
                    if (invoys1.getStatus() && invoys1.getInvoysNumber().equals(invoysNumber)) {
                        System.out.println("Siz bu invoys to`lovini to`lagansiz!");
                        showDashboard();
                    }
                    if (invoys1.getInvoysNumber().equals(invoysNumber) && !invoys1.getStatus()) {
                        System.out.println("Bu invoys raqamida " + invoys1.getCost() + "$ to`lanmagan summa bor!");
                        tolash:
                        while (true) {
                            System.out.print("To`lov summasi: ");
                            int cost = scanner.nextInt();
                            if (cost < 0) {
                                System.out.println("Manfiy summa kiritdingiz!");
                            } else if (cost > invoys1.getCost()) {
                                System.out.println("Siz ortiqcha summa to`layapsiz!\n Siz " + invoys1.getCost() + "$ to`lshingiz kerak!");
                            } else {
                                invoys1.setCost(invoys1.getCost() - cost);
                                if (invoys1.getCost() == 0) {
                                    invoys1.setStatus(true);
                                    System.out.println("Siz to`lovni qilib bo`ldingiz. To`lovingiz uchun rahmat!");
                                } else {
                                    System.out.println("Sizda " + invoys1.getCost() + "$ qoldi.");
                                }
                                break tolash;
                            }
                        }
                        break invoysniTekshirish;
                    }
                } else {
                    System.out.println("Bunday invoys ro`yhatdan o`tmagan");
                    break;
                }

            }

        }
        showDashboard();

    }

    private static void initCurrentAccount(String login) {
        for (User user : users) {
            if (user != null) {
                if (user.getLogin().equals(login))
                    currentUser = user;
            }
        }
    }

    private static boolean chekEmail(String login, String password) {
        for (User user : users) {
            if (user != null) {
                if (user.getLogin().equals(login) && user.getPasword().equals(password))
                    return true;

            }
        }
        return false;
    }


    private static void addInvoys() {
        for (User user : users){
            if(user != null && !user.getId().equals(1L)){
                System.out.println(user.getName());
            }
        }
        System.out.println("Kimga invoys qo`shmoqchisiz: ");
        String name=scanner.next();
        long id=0;
        for (User user : users){
            if(user != null && !user.getId().equals(1L)){
              if(user.getName().equals(name)){
                  id = user.getId();
              }
            }
        }
        System.out.println("Yangi invoys: ");
        String invoysNumber = scanner.next();
        System.out.println("Narxini kiriting: ");
        int cost = scanner.nextInt();
        int invoyscount = 0;
        for (Invoys invoys2 : invoys){
            if( invoys2 != null){
                invoyscount++;
            }
        }
        invoys[invoyscount] = new Invoys(invoysNumber,cost,false,users[(int) id - 1]);


    }
}
