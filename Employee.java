public class Employee extends Person {
    private double salary;
    private String employee_id;
    private String department;
    //Employee Details
    Employee(String name,int age, String gender,String mobile,double salary,String employee_id,String department){
        super(name,age,gender,mobile);
        this.salary = salary;
        this.employee_id=employee_id;
        this.department = department;
    }
    //Display Information
    void display() {
        super.display();
        System.out.println(" ");
        System.out.println("Employee salary: " + salary);
        System.out.println("Employee ID: " + employee_id);
        System.out.println("Employee department: " + department);
    }
}
