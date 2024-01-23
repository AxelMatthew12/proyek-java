package Java;
import java.util.Scanner;
public class Main2 {

    static void mainbrain(){
        Scanner sc= new Scanner(System.in);
        int option;
        System.out.println("Selamat datang di input nama");
        System.out.println("============================");
        System.out.println("|          MENU            |");
        System.out.println("|        1.LOGIN           |");
        System.out.println("|        2.LOGOUT          |");
        System.out.println("============================");
        option=sc.nextInt();
        switch (option) {
                case 1:
                loginmenu();
                break;
                case 2:
                logoutmenu();
                break; 
            default:
            System.out.println("Eror!");
                break;
        }
    }
    static void loginmenu(){
        Scanner scan= new Scanner(System.in);
        String nama;
        int passwordnya;
        String ceknama="Axel";
        int cekpass=050405;
        System.out.println("Masukkan nama anda: ");
        nama=scan.nextLine();
        System.out.println("Masukkan password anda: ");
        passwordnya=scan.nextInt();
        if (nama.equalsIgnoreCase(ceknama)&& passwordnya==(cekpass)) {
           menuinti();
        
        }else{
            System.out.println(" Mohon maaf nama/pass anda mungkin salah, Silah kan login lagi !");
        }



    }
    static void menuinti(){
        Scanner sc= new Scanner(System.in);
        int pilihanmu;
        System.out.println("--------- SELAMAT DATANG ---------");
        System.out.println("|        1.CEK ANGKA NAMA        |");
        System.out.println("|        2.PERBESAR NAMA         |");
        System.out.println("|        3.PERKECIL NAMA         |");
        System.out.println("|        4.Keluar program        |");
        System.out.println("==================================");
        System.out.println("Masukkan pilihan: ");
        pilihanmu= sc.nextInt();
        
    }

    static void logoutmenu(){

    }
}
