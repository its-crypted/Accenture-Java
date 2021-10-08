import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int r1, r2;
		System.out.println("Enter the starting range");
		r1 = sc.nextInt();
		System.out.println("Enter the ending range");
		r2 = sc.nextInt();
		
		int num1 = 0;
		int num2 = 0;
		for (int i = r1; i <= r2; i++){
		    num1 = i;
		    num2 =0;
		    while(num1!=0){
		        int rem = num1 % 10;
		        num1 /= 10;
		        num2 = num2*10+rem;
		    }
		    
		    if(i == num2)
		        System.out.println(i + " ");
		}
		sc.close();
	}

}
