import java.util.Scanner;

public class evenum{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num = sc.nextInt();
       sc.nextLine();
       int even = num % 2;
       if (even == 0){
           System.out.println(num + " is an even number");
       }
       else{
           System.out.println(num + " is an odd number");
       }
    }
    
}
