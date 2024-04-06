package practice;
import java.util.Scanner;
public class Latihan {
    public static void main(String[] args) {
        int i=0;
        for(i=0;i<=20;i++){
            if (i !=7 && i!=10) {
                if (i%2==1) {
                    System.out.println("#");
                }else{
                    System.out.println(i);
                }
            }
        }
    }
    
}
