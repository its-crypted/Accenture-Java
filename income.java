import java.util.Scanner;

public class income{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter no of hours worked in a day:");
        int hrs = sc.nextInt();
        sc.nextLine();
        if (hrs < 0 || hrs > 24){
            System.out.println("Unable to calculate the earnings");
        }
        else
        {
            long total = hrs * 365 * 100;
            System.out.println("Total income in a year:"+total);
        }
    }
}
