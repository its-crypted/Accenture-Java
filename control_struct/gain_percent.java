import java.util.Scanner;

public class Gain{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Price of old scooter:");
        float old = sc.nextFloat();
        
        System.out.println("The amount spent for repair:");
        float repair = sc.nextFloat();
        
        System.out.println("Sold Price:");
        float sold = sc.nextFloat();
        
        if (old == 0 || sold == 0 || old < 0 || sold < 0 || repair < 0){
            System.out.println("Incorrect Inputs");
            return;
        }
        
        if (sold < (old + repair)){
            System.out.println("Unable to calculate Gain Percentage");
            return;
        }
        
        float gain = (sold - (old + repair)) / (old + repair) * 100;
        
        System.out.printf("Gain percentage is %.2f", gain);
        
    }
}
