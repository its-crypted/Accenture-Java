import java.util.Scanner;

public class budget{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the cost of the mobile");
       int cost = sc.nextInt();
       sc.nextLine();
       
       if(cost <= 13000){
           System.out.println("Mobile chosen is within the budget");
       }
       else{
           System.out.println("Mobile chosen is beyond the budget");
       }
    }
    
}
