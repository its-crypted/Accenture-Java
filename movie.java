import java.util.Scanner;
import java.text.DecimalFormat;

public class movie{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		System.out.println("Etner the no of ticks:");
		double t = sc.nextInt();
		double cost = 0;

		if (t >= 5 && t <=40){

			System.out.println("Do you want refreshment:");
			String refresh = sc.next();

			System.out.println("Do you have coupon code:");
			String cc = sc.next();

			System.out.println("Enter the circle");
			String circle = sc.next();
			double ticks = 0;
			if (circle.equals("k")){
				ticks = t * 75;
			}
			else if (circle.equals("q")) {
				ticks = t * 150;
			}
			else {
				System.out.println("Invalid Input");
			}
			double t20 = ticks - ((10 * ticks) /100);
			double t2 = t20 - (t20 * 2) / 100;
			double code = ticks - (0.2 * ticks);
			double r = t * 50;

			if (refresh.charAt (0) == 'y') {
				if (cc.charAt(0) == 'y' && t > 20) {
					System.out.println("Ticket cost:" + (t2 + r)); 
				}
				else if(cc.charAt(0) == 'y' && t < 20) {
					System.out.println("Ticket cost:" + (code + r));
				}
				else if(cc.charAt(0) == 'n' && t > 20) {
					System.out.println("Ticket cost:" + (t20 + r));
				}
				else if(cc.charAt(0) == 'n' && t < 20) {
					System.out.println("Ticket cost:" + (ticks + r));
			}
			else if (refresh.charAt(0) == 'n') {

				if (cc.charAt(0) == 'y' && t > 20) {
					System.out.println("Ticket cost:" + t2); 
				}
				else if(cc.charAt(0) == 'y' && t < 20) {
					System.out.println("Ticket cost:" + code );
				}
				else if(cc.charAt(0) == 'n' && t > 20) {
					System.out.println("Ticket cost:" + t20);
				}
				else if(cc.charAt(0) == 'n' && t < 20) {
					System.out.println("Ticket cost:" + ticks);
				}		
			}		
		}
	}
		else{
			System.out.println("Minimum of 5 and Maximum of 40 Tickets");
		}
	}
}
