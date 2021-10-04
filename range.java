import java.util.Scanner;

public class range{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the number");
       int num = sc.nextInt();
       sc.nextLine();
       
       if(0 < num && num <= 100){
           System.out.println("Range of the number "+ num + " is 0 to 100");
       }
       else if(100 < num && num <= 200){
           System.out.println("Range of the number "+num+" is 100 to 200");
       }
       else if(200 < num && num <= 500){
           System.out.println("Range of the number "+num+" is 200 to 500");
       }
       else{
           System.out.println("Entered number "+num+" is not in the expected range");
       }
    }
    
}
