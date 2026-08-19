import java.util.InputMismatchException;
import java.util.Scanner;
public class Company {
// Armaan, UIN: 251P051, roll no: 26
    public static void main(String[] args){
        try{
            Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        String name = sc.nextLine();
        System.out.print("Enter Age: ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Gender: ");
        String gender =sc.nextLine();
        System.out.print("Enter Mobile: ");
        String mobile = sc.nextLine();
        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter employee_id: ");
        sc.nextLine();
        String employee_id = sc.nextLine(); 
        System.out.print("Enter Department: ");
        String department = sc.nextLine();
        System.out.print("Enter Projects: ");
        String projects = sc.nextLine();
        System.out.print("Enter Team Name: ");
        String team = sc.nextLine();
        sc.nextLine();
        Manager m1 = new Manager(name,age,gender,mobile,salary,employee_id,department,projects,team);
            m1.display();
        } catch (InputMismatchException e ){
            System.out.println("Enter integer only.");
        } catch(Exception e){
            System.out.println("Invalid Input");
        }
    }
}
