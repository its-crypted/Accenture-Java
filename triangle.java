import java.util.Scanner;

public class triangle{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value for side1\n");
        int a = sc.nextInt();
        System.out.print("Enter the value for side2\n");
        int b = sc.nextInt();
        System.out.print("Enter the value for side3\n");
        int c = sc.nextInt();
        if(a>0 && b>0 && c>0){
            if(a+b>c && a+c > b && b+c > a)
            {
                System.out.print("Sides form a Triangle");
            }
            else
            {
                System.out.println("Sides does not form a Triangle");
            }
        }
        else {
            System.out.println("Invalid Input");
        }
    }
}
