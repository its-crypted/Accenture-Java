import java.util.Scanner;

public class dispchar{
    public static void main(String a[]){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the digits:");
        int arr[] = new int[4];
        for(int i = 0; i < 4; i++){
            arr[i] = sc.nextInt();
        }
        
        for(int i = 0; i < 4; i++){
            System.out.println(arr[i] + "-"+ (char)arr[i]);
        }
    }
}
