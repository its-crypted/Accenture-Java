import java.util.Scanner;

public class BikeRace{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the distance travelled");
        int p = 1, pd =1, r;
        int d = sc.nextInt();
        if(d < 0)
            System.out.println("Invalid Input");
        else if(d == 0)
            System.out.println("Your bonus points is 0");
        else{
            while(d > 0){
                r = d % 10;
                p *= r;
                d /= 10;
                
                if (d > 0){
                    r = d % 10;
                    pd *= r;
                    d /= 10;
                }
            }
        
        
        if(p == pd)
            System.out.println("Your bonus points is "+ (p * 2));
        else if(p > pd)
            System.out.println("Your bonus points is "+ p);
        else
            System.out.println("Your bonus points is "+ pd);
        }
    }
}
