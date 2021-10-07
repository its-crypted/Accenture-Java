import java.util.Scanner;

public class Main{
    
    public static void main(String[] args){
        
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter the color");
       String color = sc.next();
       sc.nextLine();
       
       switch(color){
        case "green":
            System.out.println("go");
            break;
        case "red":
            System.out.println("stop");
            break;
        case "yellow":
            System.out.println("proceed with caution");
            break;
        default:
            System.out.println("prepare to go");
            break;
       }
    }
    
}
