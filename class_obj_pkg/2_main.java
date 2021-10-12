import java.util.*;

public class Main{
    public static Employee getEmployeeDetails(){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Id:");
        int id = sc.nextInt();
        sc.nextLine();
        
        System.out.println("Enter Name:");
        String name = sc.nextLine();
        
        System.out.println("Enter salary:");
        double sal = sc.nextDouble();
        sc.nextLine();
        
        Employee e = new Employee();
        
        e.setEmployeeId(id);
        e.setEmployeeName(name);
        e.setSalary(sal);
        return e;
    }
    
    public static int getPFPercentage(){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter PF percentage:");
        int pfp = s.nextInt();
        return pfp;
    }
    
    public static void main(String[] args){
        Employee emp1;
        emp1 = Main.getEmployeeDetails();
        int pf = Main.getPFPercentage();
        emp1.calculateNetSalary(pf);
        
        System.out.println("Id :"+ emp1.getEmployeeId());
        System.out.println("Name : "+ emp1.getEmployeeName());
        System.out.println("Salary : " + emp1.getSalary());
        System.out.println("Net Salary : "+ emp1.getNetSalary());
    }
}
