import java.util.Scanner;

    public class registration{
    
        public static void main(String a[]) {
            
            Scanner sc = new Scanner(System.in);
            
            System.out.print("Enter your name:");
            String name = sc.nextLine();

            System.out.print("Enter your age:");
            int age = sc.nextInt();
            sc.nextLine();
            
            System.out.print("Enter your phoneno:");
            long phone = sc.nextLong();
            sc.nextLine();
            
            System.out.print("Enter your qualification:");
            String qual = sc.nextLine();
            
            System.out.print("Enter your email id [Please provide valid id, after registering your registration id will be mailed]:");
            String email = sc.nextLine();
            
            System.out.print("Enter your noofexperience[if any]:");
            float exp = sc.nextFloat();
            sc.nextLine();
            
            System.out.println("Dear "+ name +", Thanks for registering in our portal, registration id will be mailed to "+ email +" within 2 working days");
        }
}
