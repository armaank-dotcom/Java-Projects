
public class StudentInfo {
// Armaan, UIN: 251P051, roll no: 26
    public static void main(String[] args) {

        Student s1 = new Student(); //Creating object for first student 
        s1.name = "Armaan Khan";
        s1.uin = "251P051";
        s1.cgpa = 9.0;
        s1.display();

        Student s2 = new Student(); //Creating object for second student 
        s2.name = "Mantasha";
        s2.uin = "251P065";
        s2.cgpa = 9.0;
        s2.display();

        Student s3 = new Student(); //Creating object for third student
        s3.name = "Shifaaaa";
        s3.uin = "251P022";
        s3.cgpa = 9.0;
        s3.display();

    }

}

//Creating class to store student details
class Student {
    
    String name; //initializing variable to store student's name
    String uin; //initializng variable to store student's UIN
    double cgpa; //initializing variable to store student's CGPA

    //Function to display student's information
    void display() {
        System.out.println("Student's name : " + name);
        System.out.println("Student's UIN : " + uin);
        System.out.println("Student's cgpa : " + cgpa);
        System.out.println("------------------------------------");
    }

}