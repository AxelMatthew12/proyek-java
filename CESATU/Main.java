package CESATU;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        tampilanawal();
    }

    static void tampilanawal(){
        Scanner scan= new Scanner(System.in);
        System.out.println("------------------------------------------------------");
        System.out.println("|------------ SELAMAT DATANG DI CESATU --------------|");
        System.out.println("=                 1.LOGIN-                           =");
        System.out.println("=                 2.REGISTER-                        =");
        System.out.println("=                 3.KELUAR-                          =");
        System.out.println("======================================================");
        System.out.println("|               MASUKKAN PILIHAN                     |");
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

        boolean berhasillogin= false;

        while (!berhasillogin) {
            System.out.println(" SILAHKAN MASUKKAN ID: ");
            String cekid= scanner.nextLine();
            System.out.println("MASUKKAN PASSWORD: ");
            int cekpas= scanner.nextInt();

            if (cekid.equalsIgnoreCase(idcek) && cekpas==(pascek)) {
                System.out.println("\n Status : ");
                System.out.println("          Berhasil login");
                System.out.println("------------------------------------------");
                System.out.println("               MASUK SEBAGAI              ");
                System.out.println("              1. MANAJER                  ");
                System.out.println("              2.KASIER                    ");
                System.out.println("|----------------------------------------|");
                int pilihkasir= scanner.nextInt();

                switch (pilihkasir) {
                // case 1:
                //      menumanajer();
                //     break;
                 case 2:
                    menukasier();
                    break;
                
                    default:
                    System.out.println(" Pilih dari 1-2 ! ");
                    loginmenu();
                        break;
                }
                berhasillogin= true;
                
            } else{
                System.out.println("\n Status: ");
                System.out.println("        <Login gagal>");
                System.out.println("Apakah anda ingin mencoba lagi? (y/n)");
                scanner.nextLine();
                String cobalagi= scanner.nextLine();

                if (!cobalagi.equalsIgnoreCase("ya")) {
                    return;
                    
                }
            }
        }
       


    }
    static void menukasier(){
        Scanner scanner= new Scanner(System.in);
        System.out.println("--------------------------------------------------------------");
        System.out.println("|                       MENU KASIR                           |");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                      1.INFO MENU                           |");
        System.out.println("|                      2.TRANSAKSI                           |");
        System.out.println("|                      3.LAKUKAN PEMBAYARAN                  |");
        System.out.println("|                      4.LAPORAN                             |");
        System.out.println("|                      5.KELUAR                              |");
        System.out.println("|------------------------------------------------------------|");
        System.out.println("|                        PILIH                               |");
        System.out.println("--------------------------------------------------------------");
        int option= scanner.nextInt();
        switch (option) {
            case 1:
                infomenu();
                break;

                case 2:
                transkasimenu();

                break;

                case 3:
                lakukanpembayaran();

                break;

                case 4:
                laporanksir();

                break;

                case 5:
                System.out.println("Anda keluar dari program !");
        
            default:
            System.out.println("SILAHKAN PILIH MENU 1-5");
                break;
                
        }
    }
    static void infomenu(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------------");
        System.out.println("               TAMPILAN MENU                ");
        
        
    }
    static void transkasimenu(){


    }
    static void lakukanpembayaran(){

    }
    static void laporanksir(){

    }
}
    