package Java;
import java.util.Scanner;

public class Main2 {
   static void mainbrain(){
        Scanner sc= new Scanner(System.in);
        //Preparation 
        String namadepan;
        String namabelakang;
        
        String pilihan1="KALKULATOR";
        String pilihan2="LOGOUT";
        

        // Code brain
        System.out.println(" Masukkan Nama depan anda: ");
        namadepan=sc.nextLine();
        System.out.println("Masukkan nama belakang anda: ");
        namabelakang=sc.nextLine();

        System.out.println("Nama anda adalah: ");
        System.out.println(namadepan + namabelakang);

        System.out.println("=======  MENU  =======");
        System.out.println("|     KALKULATOR     |");
        System.out.println("|       LOGOUT       |");
        System.out.println("======================");
        String pilihan= sc.nextLine();
        if (pilihan.equalsIgnoreCase(pilihan1)) {
            menukalkulator();
            
        }else{
            System.out.println("Anda keluar dari Program !");
        }




    }
    static void menukalkulator(){
        Scanner sc= new Scanner(System.in);
        int angka1;
        int angka2;
        System.out.println("Masukkan angka pertama: ");
        angka1=sc.nextInt();
        System.out.println("Masukkan angka kedua: ");
        angka2=sc.nextInt();
        System.out.println("Pilih parameter: + - * % ");
        String parameter= sc.nextLine();
        switch (parameter) {
            case "+":
                System.out.println(angka1 + angka2);
                break;
            case "-":
                System.out.println(angka1-angka2);
                break;
                case "*":
                System.out.println(angka1 * angka2);
                break;
                case "%":
                System.out.println(angka1 % angka2);
                break;
        
            default:
            System.out.println("Eror");
                break;
        }
    }
}
