public class Person {
    private String name;
    private int age;
    private String gender;
    private String mobile;
     // Person details
    Person(String name,int age,String gender,String mobile){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mobile = mobile;
    }
    // Display Information
    void display() {
        System.out.println("Name of person: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Contact details: " + mobile);
    }
}
