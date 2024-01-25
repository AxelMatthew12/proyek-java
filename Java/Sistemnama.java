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
        int cekpass= 123;
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
        System.out.println("|        2.UPPERCASE NAMA        |");
        System.out.println("|        3.PERKECIL NAMA         |");
        System.out.println("|        4.Keluar program        |");
        System.out.println("==================================");
        System.out.println("Masukkan pilihan: ");
        pilihanmu= sc.nextInt();
        switch (pilihanmu) {
            case 1:
            cekangka();
                break;
            case 2:
            uppername();
                break;
            case 3:
            lowername();
            break;
            case 4:
            System.out.println("Anda keluar dari program !");
            break;
        
            default:
            System.out.println("Silahkan memilih dari menu yang tersedia !");
                break;
        }
        
    }

    static void logoutmenu(){
        System.out.println(" Anda keluar dari program !");
    }

    static void cekangka(){
        Scanner sc= new Scanner(System.in);
        String masuknama;
        System.out.println("Masukkan nama anda: ");
        masuknama= sc.nextLine();
        System.out.println("\n Berikut jumlah banyak suku katan dalam nama anda: "+ " " +masuknama.length());


    }
    static void uppername(){
        Scanner sc= new Scanner(System.in);
        String namanada;
        System.out.println(" Masukkan nama anda di sini: ");
        namanada= sc.nextLine();
        System.out.println(namanada.toUpperCase());

    }

    static void lowername(){
        Scanner sc= new Scanner(System.in);
        String namanada1;
        System.out.println(" Masukkan nama anda di sini: ");
        namanada1= sc.nextLine();
        System.out.println(namanada1.toLowerCase());
    }
    public static void main(String[] args) {
        mainbrain();
    }
}
