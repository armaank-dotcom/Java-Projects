public class Manager extends Employee {
    private String projects;
    private String team;
    //Manager Details
    Manager(String name,int age, String gender,String mobile ,double salary,String employee_id,String department,String projects,String team){
        super(name, age, gender, mobile,salary, employee_id, department);
        this.projects = projects;
        this.team = team;
    }
    //Display Information
    void display() {
        super.display();
        System.out.println(" ");
        System.out.println("---Manager Details---");
        System.out.println("Name of projects: " + projects);
        System.out.println("Team name: " + team);
    }
}
