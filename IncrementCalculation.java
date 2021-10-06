import java.util.Scanner;

public class IncrementCalculation{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the salary");
        int sal = sc.nextInt();
        
        int ten = (10 * sal) / 100 + sal;
        int t5 = (25 * sal) / 100 + sal;
        int t0 = (30 * sal) / 100 + sal;
        
        System.out.println("Enter the Performance appraisal rating");
        float rating = sc.nextFloat();
        
        if(sal <= 0 || rating < 1 || rating > 5){
            System.out.println("Invalid Input");
        }
        else if (rating >= 1 && rating <= 3){
            System.out.println(ten);
        }
        else if (rating > 3.1 && rating <= 4){
            System.out.println(t5);
        }
        else if (rating > 4.1 && rating <= 5){
            System.out.println(t0);
        }
    }
}
