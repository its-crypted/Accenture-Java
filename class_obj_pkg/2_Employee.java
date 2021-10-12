public class 2_Employee{
    private int employeeId;
    private String employeeName;
    private double salary;
    private double netSalary;
    
    //getters
    public int getEmployeeId(){
        return employeeId;
    }
    public String getEmployeeName(){
        return employeeName;
    }
    public double getSalary(){
        return salary;
    }
    public double getNetSalary(){
        return netSalary;
    }
    
    //setters
    public void setEmployeeId(int employeeId){
        this.employeeId = employeeId;
    }
    
    public void setEmployeeName(String employeeName){
        this.employeeName = employeeName;
    }
    
    public void setSalary(double salary){
        this.salary = salary;
    }
    
    public void setNetSalary(double netSalary){
        this.netSalary = netSalary;
    }
    
    public void calculateNetSalary(int pfpercentage){
        double pfa;
        pfa = (salary * pfpercentage) / 100;
        netSalary = salary - pfa;
    }
}
