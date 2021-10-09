import java.util.*;

public class Power{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        long num, d;
        System.out.println("Enter the number");
        num = sc.nextLong();
        
        System.out.println("Enter the digit");
        d = sc.nextLong();
        
        if(num == 0 && d == 0){
            System.out.println("Invalid Input");
            return;
        }
        if(num < 0 || d < 0){
            System.out.println("Invalid Input");
            return;
        }
        if (num > 0 && d == 0){
            System.out.println("1");
            return;
        }
        if(num == 0 && d > 0){
            System.out.println("0");
            return;
        }
        else {
            System.out.println(power(num, d));
        }
    }
    private static long power(long num, long d){
        long res = num;
        for(int i = 1; i < d; i++)
            res *= num;
        return res;
    }
}
