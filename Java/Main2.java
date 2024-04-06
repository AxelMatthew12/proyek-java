package Java;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        int i=0;
        int j=1;
        for(i=0; i <= 5; i++){
            System.out.println("Inner :"+i);
            for (j=1; j<=6; j++){
                System.out.println("Outer : "+j);
            }
        }
    }
    
}
