package Java;

import java.util.Scanner;

public class App {
    static void mainbrain (){
        Scanner sc= new Scanner(System.in);
        int pilihan1;
        System.out.println("\n----------- WELCOME -----------");
        System.out.println("|         -----------         |");
        System.out.println("|          1.LOGIN            |");
        System.out.println("|          2.LOGOUT           |");
        System.out.println("-------------------------------");
        System.out.println("\n| SELECT: |");
        pilihan1=sc.nextInt();
        if (pilihan1==1) {
            body();
        }else{
            System.out.println(" ANDA TELAH KELUAR DARI PROGRAM ! ... TERIMAKASIH ATAS PARTISIPASINYA.... ");
        }

    }
    static void body(){
        Scanner sc= new Scanner(System.in);
        String id;
        int pass;
        String cekid="Axel";
        int cekpass= 123;
        int change = 5;
        while (change > 0) {
            System.out.println("| ID :    |");
            id = sc.nextLine();
            System.out.println("\n| PASS:   |");
            pass = sc.nextInt();
            sc.nextLine(); // Membersihkan buffer
            
            if (id.equalsIgnoreCase(cekid) && pass == cekpass) {
                System.out.println("Login berhasil!");
                Mainmenu();
                break; // Keluar dari loop jika login berhasil
            } else {
                change--; // Mengurangi jumlah percobaan login yang tersisa
                System.out.println("Mohon maaf mungkin sandi/username anda salah !...");
                System.out.println("Sisa percobaan: " + change);
            }
        }

        if (change == 0) {
            System.out.println("Anda telah melebihi batas percobaan !");
        }
    }
    static void Mainmenu(){
        Scanner sc= new Scanner(System.in);
        int choose;
        
        System.out.println("===============================");
        System.out.println("||           MENU            ||");
        System.out.println("||   1.CEK NAMA TERDAFTAR    ||");
        System.out.println("||   2.KALKULATOR PINTAR     ||");
        System.out.println("||   3.CEK FINANSIAL         ||");
        System.out.println("||   4.CEK JADWAL/TAMBAH     ||");
        System.out.println("|| CHOOSE:                   ||");
        System.out.println("===============================");
        choose= sc.nextInt();
        switch (choose) {
            case 1:
                NameRegister();
                break;
            case 2:
                SmartCalculator();
                break;
            // case 3:
            //     FinansialCek();
            //     break;
            // case 4:
            //     SceduleCek();
            //     break;

        
            default:
            System.out.println(" Silahkan input lagi menu yang ingin di pilih!... ");
                break;
        }
    }
    static void NameRegister(){
        Scanner sc= new Scanner(System.in);
        int optionchoose;
        int alteroption;
      
        System.out.println("=========== WELCOME ===========");
        System.out.println("||                           ||");
        System.out.println("||         REGISTER          ||");
        System.out.println("||         1.YES             ||");
        System.out.println("||         2.NO              ||");
        System.out.println("===============================");
        System.out.println("||Option: ||");
        optionchoose=sc.nextInt();
       if (optionchoose==1) {
        registeron();
       }else{
        System.out.println("====================");
        System.out.println("||   1.LOGOUT     ||");
        System.out.println("||   2.PREVIOUS   ||");
        System.out.println("====================");
        alteroption=sc.nextInt();
        if (alteroption==1) {
            System.out.println("ANDA TELAH KELUAR DARI PROGRAM...");
        }else{
            Mainmenu();
        }
       }
    }
    static void registeron(){
        Scanner sc= new Scanner(System.in);
        String nama;
        String pass;
        int option;
        int kesempatan=2;
        System.out.println("====================");
        System.out.println("||      NAMA :    ||");
        System.out.println("====================");
        nama=sc.nextLine();
        System.out.println("====================");
        System.out.println("||    PASSWORD :  ||");
        System.out.println("||   (NO NUMBER)  ||");
        System.out.println("====================");
        pass=sc.nextLine();
        System.out.println("MAKA NAMA ANDA ADALAH: "+nama+" DAN PASSWORD ANDA:"+pass);
        System.out.println("\n Option: ");
        while ( kesempatan > 0) {
            System.out.println("|| 1.back to main menu ||");
        System.out.println("|| 2.back to login     ||");
        option=sc.nextInt();
        switch (option) {
            case 1:
            Mainmenu();
            break;
            case 2:
            mainbrain();
            break;
            default:
            kesempatan--;
            System.out.println(" Mohon maaf pilihan anda tidak sesuai silahkan pilih option kembali: "+kesempatan);
                break;
               
        }
        if (kesempatan == 0) {
            System.out.println("Anda telah melebihi batas percobaan !");
        } 
        }    
        
    }
    static void SmartCalculator(){
        
    }
    public static void main(String[] args) {
        mainbrain();
    }
}
