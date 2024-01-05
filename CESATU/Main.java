package CESATU;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static ArrayList<String> displayMenuList = new ArrayList<>();

    public static void main(String[] args) {
        login();
    }

    static void login() {
        Scanner scanner = new Scanner(System.in);
        String user = "Cesatu";
        int sandi = 123123;
        System.out.println("Username: ");
        String cekuser = scanner.nextLine();
        System.out.println("Password: ");
        int ceksandi = scanner.nextInt();

        if (user.equalsIgnoreCase(cekuser) && sandi == (ceksandi)) {
            System.out.println("\nChoose :   ");
            System.out.println("1. Program  ");
            System.out.println("2. Exit     ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Program();
                    break;
                case 2:
                    System.out.println("--Thank you for your hard Work Today !--");
                    break;
                default:
                    System.out.println("Choose option 1-2 !");
                    break;
            }
        } else {
            System.out.println("Login failed. Please check your username and password.");
        }
    }

    static void Program() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("============================");
        System.out.println("|        Welcome           |");
        System.out.println("| Choose role:             |");
        System.out.println("|         Manajer          |");
        System.out.println("|         Kasir            |");
        System.out.println("|         Admin            |");
        System.out.println("============================");
        System.out.println("Role yang dipilih: ");
        String choose = scanner.nextLine();
        switch (choose) {
            case "Manajer":
                menumanajer();
                break;
            case "Kasir":
                menukasir();
                break;
            default:
                System.out.println("Invalid choice. Please choose 'Manajer' or 'Kasir'.");
                break;
        }
    }

    static void menumanajer() {
        // Implementasi untuk peran Manajer
        System.out.println("Welcome Manajer!");
    }

    static void menukasir() {
        Scanner scanner = new Scanner(System.in);
        int menuChoice;

        do {
            System.out.println("--------------------------");
            System.out.println("|          MENU          |");
            System.out.println("|   1. Display Menu      |");
            System.out.println("|   2. Add Menu          |");
            System.out.println("|   3. Pemesanan         |");
            System.out.println("|   4. Transaksi         |");
            System.out.println("|   5. Exit              |");
            System.out.println("--------------------------");
            System.out.println("Choose: ");

            menuChoice = scanner.nextInt();
            scanner.nextLine();  // Consumes the newline character

            switch (menuChoice) {
                case 1:
                    displayMenu();
                    break;
                case 2:
                    addMenu();
                    break;
                case 3:
                    rolepemesanan();
                    break;
                case 4:
                    // Implementasi untuk transaksi
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose options 1-5.");
                    break;
            }
        } while (menuChoice != 5);
    }

    static void displayMenu() {
        System.out.println("----- Display Menu -----");
        if (displayMenuList.isEmpty()) {
            System.out.println("Menu is empty.");
        } else {
            for (int i = 0; i < displayMenuList.size(); i++) {
                System.out.println((i + 1) + ". " + displayMenuList.get(i));
            }
        }
    }

    static void addMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter menu item: ");
        String newItem = scanner.nextLine();
        displayMenuList.add(newItem);
        System.out.println("Menu item added successfully!");
    }

    static void rolepemesanan() {
        // Implementasi untuk peran Kasir dalam pemrosesan pemesanan
        System.out.println("Pemesanan...");
    }
}
