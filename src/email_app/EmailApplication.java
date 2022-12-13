package email_app;
import email_app.Model.Email;
import email_app.Model.User;

import java.util.Scanner;

public class EmailApplication {


    //public static Account[] account = new Account[1000];
    public static User[] users = new User[100];
    public static Scanner scanner;
    public static Email[] emails = new Email[1000];
    public static User currentUser = null;


    public static void main(String[] args) {
//        users[0] = new User("Anvar", "Olimov",25, "olimovanvar@gmail.com", "parol");
//        users[1] = new User("User", "Userov", 20, "email", "parol");

        scanner = new Scanner(System.in);
        while (true) {
            System.out.println("--------Email App----------");
            System.out.println("1.Login");
            System.out.println("2.Register");
            System.out.println("3.All Email");
            System.out.println("0.Exit");

            int choise = scanner.nextInt();

            switch (choise) {
                case 1:
                    login();
                    break;
                case 2:
                    register();
                    break;
                case 3:
                    showUserList();
                    break;
                case 0:
                    System.out.println("------- Thank you! --------");
                    return;

            }

        }

    }

    private static void showUserList() {
        for (User user : users) {
            if (user != null) {
                System.out.println(user);
            }
        }
    }

    private static void register() {
        System.out.print("Ismingiz:  ");
        String firstName = scanner.nextLine();
        System.out.print("Familiyangiz:  ");
        String lastName = scanner.next();
        System.out.print("Yoshingiz: ");
        int age = scanner.nextInt();
        System.out.print("Email:  ");
        String email = scanner.next();
        System.out.print("Parolingiz: ");
        String password = scanner.next();
        int cnt = 1;
        for (User user : users) {
            cnt++;
            if (user == null) {
                break;
            }
        }
        users[cnt] = new User(firstName, lastName,age, email, password);
    }

    private static void login() {
        scanner = new Scanner(System.in);

        System.out.print("email: ");
        String email = scanner.nextLine();
        System.out.print("password: ");
        String password = scanner.nextLine();

        if (chekEmail(email, password)) {
            initCurrentAccount(email);
            showDashboard();
        } else {
            System.out.println("Something went wrong!");
        }
    }

    private static void initCurrentAccount(String email) {
        for (User user : users) {
            if (user != null && user.getEmail().equals(email)) {
                currentUser = user;
                break;
            }
        }
    }


    private static boolean chekEmail(String email, String password) {
        for (User user : users) {
            if (user != null) {
                if (user.getEmail().equals(email) && user.getPassword().equals(password)) {
                    return true;
                }
            }
        }
        return false;
    }


    private static void showDashboard() {

        System.out.println("\n\t" + currentUser.getFirstname()
                + " " + currentUser.getLastname() + "\t\t" + currentUser.getEmail());
        System.out.println("1.New Message");
        System.out.println("2.Unread");
        System.out.println("3.Inbox");
        System.out.println("4.Outbox");
        System.out.println("5.Change password");
        System.out.println("6.Log out");
        System.out.println("0.Exit");

        int choise = scanner.nextInt();
        switch (choise) {
            case 1:
                newMessage();
                break;
            case 2:
                unreadMessage();
                break;
            case 3:
                inboxMessage();
                break;
            case 4:
                outBox();
                break;
            case 5:
                changePassword();
                break;
            case 6:
                logOut();
                return;
            default:
                System.out.println("Biz boshqa amallarni keyingi versiyada qo`shamiz!");
        }
    }

    private static void outBox() {
        int countOutbox = 0;
        for (Email email : emails) {
            if (email !=null && email.getSender() == currentUser ) {
//                for (account.getInbox()) ;
                System.out.println("---------------------------------------------");
                System.out.println(++countOutbox + "-xabar");
                System.out.println("\nXabar sarlavhasini:    " + email.getTitle());
                System.out.println("Xabar matni:    " + email.getBody());
                email.setStatus(true);
            }
        }
        showDashboard();
    }

    private static void unreadMessage() {
        int countInbox = 0;
        for (Email email : emails) {
            if (email !=null && email.getReceiver() == currentUser && !email.getStatus()) {
//                for (account.getInbox()) ;
                System.out.println("---------------------------------------------");
                System.out.println(++countInbox + "-xabar");
                System.out.println("\nXabar sarlavhasini:    " + email.getTitle());
                System.out.println("Xabar matni:    " + email.getBody());
                email.setStatus(true);
            }
        }
        showDashboard();
    }

    private static void inboxMessage() {
        int countInbox = 0;
        for (Email email : emails) {
            if (email !=null && email.getReceiver() == currentUser) {
//                for (account.getInbox()) ;
                System.out.println("---------------------------------------------");
                System.out.println(++countInbox + "-xabar");
                System.out.println("\nXabar sarlavhasini:    " + email.getTitle());
                System.out.println("Xabar matni:    " + email.getBody());
                email.setStatus(true);
            }
        }
        showDashboard();
    }
    public static int countEmail = 0;
    private static void newMessage() {
        scanner = new Scanner(System.in);
        for (User user : users) {
            if (user != null) {
                System.out.println(user.getEmail());
            }
        }
        System.out.print("To: ");
        String receiverEmail = scanner.next();
        User receiverAccount = null;
        for (User user : users) {
            if (user != null) {
                if (user.getEmail().equals(receiverEmail)) {
                    receiverAccount = user;
                    break;
                }
            }
        }
        if (receiverAccount != null) {
            scanner = new Scanner(System.in);
            System.out.println("Title: ");
            String title = scanner.nextLine();
            System.out.println("Message: ");
            String message = scanner.nextLine();

            for(Email email : emails){
                if (email != null) {
                   countEmail++;
                   break;
                }
            }
            emails[countEmail] = new Email(title,message,currentUser,receiverAccount,false);
            showDashboard();
        }

    }

    private static void logOut() {
        currentUser = null;
    }

    private static void changePassword() {
        System.out.print("Eski parolni Kiriting: ");
        String oldPassword = scanner.next();
        if (currentUser.getPassword().equals(oldPassword)) {
            System.out.print("Yangi parolni kiriting:  ");
            String newPassword = scanner.next();
            currentUser.setPassword(newPassword);
            showDashboard();
        }
    }


}
