package CESATU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tampilanawal();
    }

    static void tampilanawal(){
        Scanner scan= new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("   |                                                | ");
        System.out.println("------------- SELAMAT DATANG DI CESATU ---------------");
        System.out.println("==                                                  ==");
        System.out.println("==                 1.LOGIN-                         ==");
        System.out.println("==                 2.REGISTER-                      ==");
        System.out.println("==                 3.KELUAR-                        ==");
        System.out.println("======================================================");
        System.out.println("                MASUKKAN PILIHAN                      ");
        System.out.println("------------------------------------------------------");
        int pilihan= scan.nextInt();
        switch (pilihan) {
            case 1:
                loginmenu();
                break;
            // case 2:
            // registermenu();
            default:
            System.out.println("Silahkan pilih menu 1-3 !");
                break;
        }
    
    }
    static void loginmenu(){
        String idcek="Cesatu";
        int pascek= 123123;
        Scanner scanner= new Scanner(System.in);
        System.out.println("SILAHKAN MASUKKAN ID : ");
        String masukid= scanner.nextLine();
        System.out.println("MASUKKAN PASSWORD ANDA: ");
        int masukpas= scanner.nextInt();
        if (masukid.equalsIgnoreCase(idcek)&& masukpas==(pascek)) {
            System.out.println("<LOGIN BERHASIL>\n");
            System.out.println("-----------------");
            System.out.println(" MASUK SEBAGAI ? ");
            System.out.println(" 1.MANAJER       ");
            System.out.println(" 2.KASIER        ");
            System.out.println("-----------------");
            int pilihankarir= scanner.nextInt();
            switch (pilihankarir) {
                case 1:
                // menumanajer();
                    break;
                    case 2:
                    menukasier();
                    break;
                default:
                System.out.println("SILAHKAN PILIH DARI 1-2");
                    break;
            }
        }
        else{
            System.out.println("SISTEM KELUAR");
             return;
        }
       


    }
    static void menukasier(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("|                       MENU KASIR                           |");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                      1.INFO MENU                           |");
        System.out.println("|                      2.TRANSAKSI                           |");
        System.out.println("|                  3.LAKUKAN PEMBAYARAN                      |");
        System.out.println("|                      4.LAPORAN                             |");
        System.out.println("|                      5.KELUAR                              |");
        System.out.println("|                                                            |");
        System.out.println("|                        PILIH                               |");
        System.out.println("--------------------------------------------------------------");
    }
}
    