import java.util.Scanner;

public class CarDetails{
    public static void main(String a[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the car name:");
        String name = sc.nextLine();
        
        System.out.println("Enter the car no:");
        int no = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the price:");
        double price = sc.nextDouble();
        sc.nextLine();
        
        System.out.println("Carname:"+name);
        System.out.println("Carno:"+no);
        System.out.printf("Price:%1$.2f rs only", price);
    }
}
