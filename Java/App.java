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
            logout();
        sc.nextLine();
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
        Scanner sc= new Scanner(System.in);
        // Setup
        int pilian;
        int option1;
        int angkaoption1;
        int angkaoption2;
        int angka1option1;
        int angka1option2;
        int angka2option3;
        int angka2option4;
        int angka3option5;
        int angka3option6;
        int desision;
        

        // Code brain
        System.out.println("=============================");
        System.out.println("||    -----------------    ||");
        System.out.println("||       KALKULATOR        ||");
        System.out.println("||     1.NON DESIMAL       ||");
        System.out.println("||     2. DESIMAL          ||");
        System.out.println("||=========================||");
        pilian=sc.nextInt();
        if (pilian==1) {
            System.out.println("||===================================||");
            System.out.println("||note: parameter (+-*/)(1,2,3,4)    ||");
            System.out.println("||===================================||");
            System.out.println("||         SELECT PARAMETER          ||");
            option1=sc.nextInt();
            switch (option1) {
                case 1:
                    System.out.println("Masukkan angka pertama :  ");
                    angkaoption1=sc.nextInt();
                    System.out.println("Masukkan angka ke dua  :  ");
                    angkaoption2=sc.nextInt();
                    // Runing brain code
                    int angkatotal=angkaoption1+angkaoption2;
                    // Result
                    System.out.println("Hasil = "+angkatotal);
                    System.out.println("===============================");
                    System.out.println("||       NAH                 ||");
                    System.out.println("||   1.back ke menu awal     ||");
                    System.out.println("||   2.back ke mainmenu      ||");
                    System.out.println("||   3.back ke login         ||");
                    System.out.println("||===========================||");
                    desision=sc.nextInt();
                    switch (desision) {
                        case 1:
                        SmartCalculator();
                        break;
                        case 2:
                        Mainmenu();
                        break;
                        case 3:
                        mainbrain();
                        break;
        
                    
                        default:
                            break;
                    }

                    break;
                case 2:
                    System.out.println("Masukkan angka petama  :  ");
                    angka1option1=sc.nextInt();
                    System.out.println("Masukkan angka kedua   :  ");
                    angka1option2=sc.nextInt();
                    // Brain code
                    int angkatotalkan=angka1option1-angka1option2;
                    // Result
                    System.out.println("Hasil= "+angkatotalkan);
                    System.out.println("===============================");
                    System.out.println("||       NAH                 ||");
                    System.out.println("||   5.back ke menu awal     ||");
                    System.out.println("||   6.back ke mainmenu      ||");
                    System.out.println("||   7.back ke login         ||");
                    System.out.println("||===========================||");
                    desision=sc.nextInt();
                    switch (desision) {
                        case 5:
                        SmartCalculator();
                        break;
                        case 6:
                        Mainmenu();
                        break;
                        case 7:
                        mainbrain();
                        break;
                    }
                case 3:
                    System.out.println("Masukkan angka pertama :  ");
                    angka2option3=sc.nextInt();
                    System.out.println("Masukkan angka kedua   :  ");
                    angka2option4=sc.nextInt();
                    int angkatotal3=angka2option3 * angka2option4;
                    System.out.println("Hasil = "+angkatotal3);

                    System.out.println("===============================");
                    System.out.println("||       NAH                 ||");
                    System.out.println("||   5.back ke menu awal     ||");
                    System.out.println("||   6.back ke mainmenu      ||");
                    System.out.println("||   7.back ke login         ||");
                    System.out.println("||===========================||");
                    desision=sc.nextInt();
                    switch (desision) {
                        case 5:
                        SmartCalculator();
                        break;
                        case 6:
                        Mainmenu();
                        break;
                        case 7:
                        mainbrain();
                        break;
                    }
                case 4:
                System.out.println("Masukkan angka pertama     :  ");
                angka3option5=sc.nextInt();
                System.out.println("Masukkan angka ke dua      :  ");
                angka3option6=sc.nextInt();
                int angkatota4= angka3option5 / angka3option6;
                System.out.println("Hasil = "+angkatota4);
                System.out.println("===============================");
                System.out.println("||           NAH             ||");
                System.out.println("||   5.back ke menu awal     ||");
                System.out.println("||   6.back ke mainmenu      ||");
                System.out.println("||   7.back ke login         ||");
                System.out.println("||===========================||");
                desision=sc.nextInt();
                switch (desision) {
                    case 5:
                    SmartCalculator();
                    break;
                    case 6:
                    Mainmenu();
                    break;
                    case 7:
                    mainbrain();
                    break;
                }
                    
                default:
                System.out.println("Pilihlah seusai dengan option yang di miliki");
                    break;
            }


        }else{
            desimaloption();
        }
    }
    static void desimaloption(){
            Scanner sc= new Scanner(System.in);
            // preparation
            int desision;
            double case1option;
            double case1option2;
            double case2option1;
            double case2option2;
            double case3option1;
            double case3option2;
            double case4option1;
            double case4option2;
            int option1;
            int option2;
            int option3;
            // generate code
            System.out.println("======================================");
            System.out.println("||       KALKULATOR DESINMAL        ||");
            System.out.println("||                                  ||");
            System.out.println("||Option:(+-*/) atau (1,2,3,4)      ||");
            System.out.println("||==================================||");
            desision=sc.nextInt();
            switch (desision) {
                case 1:
                System.out.println("Masukkan angka pertama anda : ");
                case1option=sc.nextDouble();
                System.out.println("Masukkan angak kedua anda   : ");
                case1option2=sc.nextDouble();
                // brain calculate
                double total=case1option+case1option2;
                //result
                System.out.println("Hasil = "+total);

                System.out.println("\n==========================");
                System.out.println("||          MENU          ||");
                System.out.println("||  1.Back to calculator  ||");
                System.out.println("||  2.Back to main menu   ||");
                System.out.println("||  3.Back to login menu  ||");
                System.out.println("============================");
                option1=sc.nextInt();
                switch (option1) {
                    case 1:
                        SmartCalculator();
                        break;
                    case 2:
                        Mainmenu();
                        break;
                    case 3:
                        mainbrain();
                        break;
                    default:
                    System.out.println("Pilih sesuai option yang tersedia ! ...");
                        break;
                }
                break;
                case 2:
                System.out.println("Masukkan angka pertama anda : ");
                case2option1=sc.nextDouble();
                System.out.println("Masukkan angka kedua anda   : ");
                case2option2=sc.nextDouble();
                // main brain code
                double totalkan=case2option1-case2option2;
                // result
                System.out.println("Hasil = "+totalkan);
                break;
                case 3:
                System.out.println("Masukkan angka pertama anda : ");
                case3option1=sc.nextDouble();
                System.out.println("Masukkan angka kedua anda   : ");
                case3option2=sc.nextDouble();
                // main brain
                double totalkan1=case3option1*case3option2;
                // result
                System.out.println("Hasil = "+totalkan1);
                break;
                case 4:
                System.out.println("Masukkan angka pertama anda : ");
                case4option1=sc.nextDouble();
                System.out.println("Masukkan angka kedua anda   : ");
                case4option2=sc.nextDouble();
                // main brain
                double totalkan2=case4option1/case4option2;
                // result
                System.out.println("Hasil = "+totalkan2);
                break;
                
            
                default:
                System.out.println("Silahkan pilih option yang tertera ! ");
                    break;
            }
    }
    static void logout(){
        System.out.println("Anda keluar dari aplikasi ! ...");
        
    }
    public static void main(String[] args) {
        mainbrain();
    }
}
