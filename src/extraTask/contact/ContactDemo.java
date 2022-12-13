package extraTask.contact;

import java.util.Scanner;

public class ContactDemo {
    public static Scanner scanner = new Scanner(System.in);
    public static User[] users = new User[100];
    public static Contact[] contacts = new Contact[1000];

    public static void main(String[] args) {

        users[1] = new User("Anvar", "olimov@gmail.com", "shixbog`i");
        users[2] = new User("Jahongir", "jahongir@gmail.com", "qo`yliq");
//        contacts[0] =new Contact("999999999",users[0]);
        contacts[1] = new Contact("+998997777777", users[1]);
        contacts[2] = new Contact("+998996666666", users[2]);


        BoshEkran:
        while (true) {
            System.out.println("---------Contact------------");
            System.out.println("1.Yangi contact");
            System.out.println("2.Mening contactlarim");
            System.out.println("3.O`zgartirish");
            System.out.println("4.O`chirish");
            System.out.println("5.Ikkinchi nomer qo`shish");
            System.out.println("6.Chiqish");
            int choose = scanner.nextInt();
            switch (choose) {
                case 1 -> newContact();
                case 2 -> myContact();
                case 7 -> deletedContact();
                case 8 -> restoreContact();
                case 3 -> changeContact();
                case 4 -> deleteContact();
                case 5 -> addsecondNumber();
                case 6 -> {
                    break BoshEkran;
                }
                default -> System.out.println("Bizda boshqa menyu yo`q");
            }

        }
    }

    private static void addsecondNumber() {
        for (User user : users) {
            if (user != null) {
                System.out.println(user.getId() + ". " + user.getName());

            }
        }
        long choose = scanner.nextLong();
        System.out.print("Ikkinchi nomerni kiriting: +998");
        String sNumber = scanner.next();
        String secondnumber = "";
        secondnumber = "+998" + sNumber;
        long id = 0;
        String s = "";
        for (Contact contact : contacts) {
            if (contact != null) {
                if (contact.getUser().getId().equals(users[(int) choose].getId())) {
                    s = contact.getNumber();
                    id = contact.getId();
                }
            }
        }
        s += " " + secondnumber;
        contacts[(int) id].setNumber(s);

    }


    private static void newContact() {

        System.out.print("Telefon nomer: +998");
        String tnumber = scanner.next();
        String telnumber = "+998" + tnumber;
        System.out.print("Ism: ");
        String name = scanner.next();
        for (User user : users) {
            if (user != null) {
                if(user.getName().equals(name)){
                    System.out.println("Sizda " + name + " ismli contact mavjud ");
                }
            }
        }
        scanner = new Scanner(System.in);
        System.out.print("Manzil: ");
        String address = scanner.nextLine();
        System.out.print("Email: ");
        String email = scanner.next();
        int cnt = 1;
        for (User user : users) {
            if (user != null) {
                cnt++;
            }
        }
        users[cnt] = new User(name, email, address);
        int cnt1 = 1;
        for (Contact contact : contacts) {
            if (contact != null) {
                cnt1++;
            }
        }
        contacts[cnt1] = new Contact(telnumber, users[cnt]);
    }

    private static void myContact() {
        for (Contact contact : contacts) {
            if (contact != null && contact.getHas()) {
                System.out.println(contact);
            }
        }

//        String[] telNumber = new String[100];
//        for (User user : users) {
//            if (user != null) {
//                for (Contact contact : contacts) {
//                    if (contact != null) {
//                        if (contact.getUser().equals(user)) {
//                            long count = contact.getId();
//                            telNumber[(int) count] += (contact.getNumber() + ", ");
//                        }
//                    }
//                }
//            }
//        }
////        System.out.println(telNumber);
//
//        for (Contact contact : contacts) {
//            if (contact != null && contact.getHas()) {
//                long count = contact.getId();
//                System.out.println(contact.getId() + " " + contact.getUser().getName() + " "
//                        + telNumber[(int) count] + " " + contact.getUser().getAddress() + " " + contact.getUser().getEmail());
//            }
//        }
    }

    private static void deletedContact() {
        for (Contact contact : contacts) {
            if (contact != null && !contact.getHas()) {
                System.out.println(contact);
            }
        }
    }

    private static void changeContact() {
        for (Contact contact : contacts) {
            if (contact != null) {
                System.out.println(contact);
            }
        }
        System.out.print("Qaysi contactni o`zgartirmoqchisiz: ");
        long choose = scanner.nextLong();
        for (Contact contact : contacts) {
            if (contact != null) {
                if (contact.getId().equals(choose)) {
                    System.out.println("1.Ism");
                    System.out.println("2.Nomer");
                    System.out.println("3.Manzili");
                    System.out.println("4.Mail");
                    System.out.println("5.Bosh menyu");

                    int chooseChange = scanner.nextInt();
                    switch (chooseChange) {
                        case 1 -> {
                            System.out.print("Oldingi ism: " + contact.getUser().getName() + " Yangi ism:");
                            String newName = scanner.next();
                            contact.setUserName(newName);
                            changeContact();
                        }
                        case 2 -> {
                            System.out.print("Oldingi nomer: " + contact.getNumber() + " Yangi nomer:");
                            String number = scanner.next();
                            contact.setNumber(number);
                            changeContact();
                        }
                        case 3 -> {
                            System.out.print("Manzil ism: " + contact.getUser().getAddress() + " Yangi manzil:");
                            String newAddress = scanner.next();
                            contact.setUserAddress(newAddress);
                            changeContact();
                        }
                        case 4 -> {
                            System.out.print("Oldingi mail: " + contact.getUser().getEmail() + " Yangi mail:");
                            String newMail = scanner.next();
                            contact.setUserMail(newMail);
                            changeContact();
                        }
                        case 5 -> System.out.println("-------------------------------------------------------------");
                    }
                }
            }
        }

    }

    private static void deleteContact() {
        for (Contact contact : contacts) {
            if (contact != null && contact.getHas()) {
                System.out.println(contact);
            }
        }
        long choose = scanner.nextLong();
        for (Contact contact : contacts) {
            if (contact != null) {
                if (contact.getId().equals(choose)) {
                    contact.setHas(false);
                }
            }
        }
    }

    private static void restoreContact() {
        for (Contact contact : contacts) {
            if (contact != null && !contact.getHas()) {
                System.out.println(contact);
            }
        }
        long choose = scanner.nextLong();
        for (Contact contact : contacts) {
            if (contact != null) {
                if (contact.getId().equals(choose)) {
                    contact.setHas(true);
                }
            }
        }
    }


}
