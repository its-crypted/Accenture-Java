import java.util.*;

public class PrimeNumbers{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int flag;
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println();
        
        if(a <= 0 || a >= b || b <=0){
            System.out.println("Provide valid input");
        }
        else {
            inner:
            while(a <= b){
                if(a == 2)
                    System.out.print(a + " ");
                else if(a == 1){
                    a++;
                    continue;
                }
                else{
                    flag = 0;
                    outer:
                    for(int i = 2; i <= a/2; i++){
                        if(a % i == 0){
                            flag = 1;
                            break outer;
                        }
                    }
                    if(flag == 0)
                    System.out.print(a+" ");
                }
                a++;
            }
        }
    }
}
