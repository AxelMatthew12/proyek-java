package Java;

import java.util.Scanner;

import javax.sound.midi.Soundbank;
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
            // case 2:
            //     SmartCalculator();
            //     break;
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
        System.out.println("=========== WELCOME ===========");
        System.out.println("||                           ||");
        System.out.println("||       REGISTER MENU       ||");
        System.out.println("||      1.NAME               ||");
        System.out.println("||      2.PASSWORD           ||");
        System.out.println("||     (U can freely choose) ||");
        System.out.println("===============================");
        System.out.println("(Option : )                    ");
        optionchoose= sc.nextInt();

    }
    public static void main(String[] args) {
        mainbrain();
    }
}
