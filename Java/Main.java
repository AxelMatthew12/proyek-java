package Java;
import java.util.Scanner;

public class Main {
    
    static void menu(){
        // preparation
        Scanner sc= new Scanner(System.in);
        String pilihan="Login";
        String pilihan1="Logout";
        String loginid="login";
        int loginpass=123;
        // Code execution
        System.out.println("====== Weclome =====");
        System.out.println("|      Login       |");
        System.out.println("|      Logout      |");
        System.out.println("====================");
        String option= sc.nextLine();

        if (option.equalsIgnoreCase(pilihan)) {
            // Spasi
            System.out.println("\n");
            System.out.println("\n");
            // Isian
            System.out.println("\n-----------------");
            System.out.println("|     Login     |");
            System.out.println("-----------------");
            System.out.println("\n-----------------");
            System.out.println("|  ID:           |");
            System.out.println("-----------------");
            String inputid= sc.nextLine();
            System.out.println("-----------------");
            System.out.println("| PASS:         |");
            System.out.println("-----------------");
            int inputpass= sc.nextInt();
            
            if (inputid.equalsIgnoreCase(loginid)&& inputpass==loginpass) {
                headmenu();
            }else
            System.out.println("Password/id anda bermasalah !");
        }
    }

    static void headmenu(){
        Scanner sc= new Scanner(System.in);
        String headmenu="PESAN";
        String headmenu1="PEMBAYARAN";
        System.out.println("-----------------");
        System.out.println("|   HEAD  MENU  |");
        System.out.println("|      =-=      |");
        System.out.println("|    PESAN      |");
        System.out.println("|  PEMBAYARAN   |");
        System.out.println("=================");
        System.out.println("| PILIHAN:      |");
        System.out.println("=================");
        String userpilih= sc.nextLine();
        if (userpilih.equalsIgnoreCase(headmenu)) {
            menupesanan();
        } else{
            menupembayaran();
        }
    }

        static void menupesanan(){
            Scanner sc= new Scanner(System.in);
            System.out.println("===================");
            System.out.println("|      MENU       |");
            System.out.println("|    1.Rice Bowl  |");
            System.out.println("|    2.Rice Bowl2 |");
            System.out.println("|     MINUMAN     |");
            System.out.println("|    1. ES TEH    |");
            System.out.println("|    2. TEH ANGET |");
            System.out.println("|    3. Air Putih |");
            System.out.println("===================");
            System.out.println("Pilihan :          ");
            int inputmenu= sc.nextInt();
            switch (inputmenu) {
                case 1:
                System.out.println("Rice Bowl +1");
                    break;
                    case 2:
                    System.out.println("Rice Bowl2 +1");
                    break;
                    case 3:
                    System.out.println("");
                default:
                    break;
            }


        }

        static void menupembayaran(){
            String pilihansistem="TUNAI";
            String pilihansistem2="NON TUNAI";
            Scanner sc= new Scanner(System.in);
            System.out.println("====== SISTEM PEMBAYARAN =====");
            System.out.println("|           TUNAI            |");
            System.out.println("|          NON TUNAI         |");
            System.out.println("==============================");
            String pilihmetod= sc.nextLine();
            if (pilihmetod.equalsIgnoreCase(pilihansistem)) {
                System.out.println(" INPUT KAN TOTAL HARGA YG DI DAPAT: ");
                int totaluang= sc.nextInt();

                System.out.println(" TOTAL PEMBAYARAN: ");
                int totaltotal= sc.nextInt();

                System.out.println("\nMAKA TOTAL PEMBAYARAN ANDA"+"="+totaluang+"\tTOTAL UANG YANG DITERIMA"+"="+totaltotal);
            } else {
                System.out.println(" EROR");
            }



        }
    public static void main(String[] args) {
        menu();
    }
}
