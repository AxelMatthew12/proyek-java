package Resto;
import java.util.Scanner;
public class Braincode {
    
    static void Main(){
        System.out.println("======== Welcome =========");
        System.out.println("||                      ||");
        System.out.println("||   1. CEK MENU        ||");
        System.out.println("||   2. PESAN MENU      ||");
        System.out.println("||   3. CHECKOUT        ||");
        System.out.println("||   4.KELUAR           ||");
        System.out.println("==========================");

    }

    static String Login(String option){
        Scanner sc = new Scanner(System.in);
        System.out.println("||Login sebagai :      ||");
        System.out.println("||Admin(a)/Manajer(m)  ||");
        option = sc.nextLine();
        return option;
    }
}
