import java.util.Scanner;

public class num_months{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        String mon[]={"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        if(num > 12 || num < 1) {
            System.out.println("No month for the number "+ num);
        } else {
            System.out.println(mon[num - 1]);
        }
    }
}
