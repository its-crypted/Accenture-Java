import java.util.Scanner;

public class celtofar{
    public static void main(String a[]){
        Scanner sc = new Scanner(System.in);
        
        int cel = sc.nextInt();
        double far = (cel * 1.8)+32;
        
        System.out.printf("%.1f", far);
    }
}
