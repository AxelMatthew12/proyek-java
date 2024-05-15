package Implemen;
import java.util.Scanner;
public class MainResto {
    
    public static void Menu() {
        System.out.println("Selamat datang di E-QueueResto");
        System.out.println("==============================");
        System.out.println("1. Daftar antrian  ");
        System.out.println("2. Lihat daftar    ");
        System.out.println("3. Batalkan antrian");
        System.out.println("========================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan kapasitas: ");
        int n = sc.nextInt();

        Restoran r = new Restoran(n);
        int pilih;

        do {
            Menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.println("Masukkan Antrian baru");
                    int dataMasuk = sc.nextInt();
                    r.Enqueue(dataMasuk);
                    break;
            case 2:
            int dataKeluar = r.Dequeue();
            if (dataKeluar !=0) {
                System.out.println("Antrian yang dikeluarkan: "+ dataKeluar);
                break;
            }
            case 3:
                r.print();
                break;
            case 4:
                r.peek();
                break;
            case 5:
                r.clear();
                break;
            }
        } while (pilih == 1 || pilih == 2|| pilih == 3 || pilih == 4 || pilih == 5);
        }
    }

