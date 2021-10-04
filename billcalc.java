import java.util.Scanner;

public class billcalc{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the units consumed");
       int unit = sc.nextInt();
       
       if(unit <= 20){
           System.out.println("No Charge");
       }
       else if(unit > 20 && unit < 100){
           System.out.println("You have to pay Rs."+ 3.50*(float)unit);
       }
       else if(unit >=100){
           System.out.println("You have to pay Rs."+ 5.00*(float)unit);
       }
    }
    
}
