import java.util.Scanner;

public class billgen{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the no of pizzas bought:");
        int pizza = sc.nextInt();
        
        System.out.println("Enter the no of puffs bought:");
        int puff = sc.nextInt();
        
        System.out.println("Enter the no of cool drinks bought:");
        int drink = sc.nextInt();
        
        System.out.println("Bill Details");
        System.out.println("No of pizzas:" + pizza);
        System.out.println("No of puffs:"+puff);
        System.out.println("No of cooldrinks:"+drink);
        int total = 100 * pizza + 20 * puff + 10 * drink;
        System.out.println("Total price="+ total);
        System.out.println("ENJOY THE SHOW!!!");
    }
}
