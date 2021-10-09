import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int d = 0, rev = 0, temp;
        int num = sc.nextInt();
        temp = num;
        if(num < 0){
            System.out.println("Invalid Input");
        }
        else {
            while(num > 0){
                d = num % 10;
                rev = (rev * 10)+ d;
                num = num / 10;
            }
            if(temp == rev)
                System.out.println("Palindrome");
            else
                System.out.println("Not a Palindrome");
        }
    }
}
