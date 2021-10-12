import java.util.*;

public class 1_TestBook{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Book name:");
        String name = sc.nextLine();
        
        System.out.println("Enter the price:");
        int price = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter the Author name:");
        String auth = sc.nextLine();
        
        Book bookObj = new Book();
        bookObj.setBookName(name);
        bookObj.setBookPrice(price);
        bookObj.setAuthorName(auth);
        
        System.out.println("Book Details");
        System.out.println("Book Name :"+ bookObj.getBookName());
        System.out.println("Book Price :"+ bookObj.getBookPrice());
        System.out.println("Author Name :"+bookObj.getAuthorName());
    }
}
