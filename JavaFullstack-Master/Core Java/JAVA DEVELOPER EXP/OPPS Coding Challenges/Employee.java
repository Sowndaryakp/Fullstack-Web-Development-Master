public class Employee{
    private String employeeId;
    private String name;
    private String department;

    //constructor
    public Employee(String employeeId,String name, String department){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    //getter methods
    public String getEmployeeId(){
        return employeeId;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }

    //setter methods
    public void setEmployeeId(String employeeId){
        this.employeeId = employeeId;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setDepartment(String department){
        this.department = department;
    }

    public static void main(String[] args){
        Employee emp = new Employee("1", "Sona", "CS");
        System.out.println("EmployeeID :" + emp.getEmployeeId());
        System.out.println("Name :" + emp.getName());
        System.out.println("Department :" + emp.getDepartment());
    }
}