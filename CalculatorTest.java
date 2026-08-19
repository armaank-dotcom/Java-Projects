public class CalculatorTest {
// Armaan, UIN: 251P051, roll no: 26
    // Main method - program execution starts from here
    public static void main(String[] args) {

        // Create the first Calculator object using the default constructor
        Calculator c1 = new Calculator();

        // Display the values of a and b of object c1
        System.out.println("A : " + c1.a + " ; B : " + c1.b);

        // Create the second Calculator object using the default constructor
        Calculator c2 = new Calculator();

        // Display the values of a and b of object c2
        System.out.println("A : " + c2.a + " ; B : " + c2.b);

        // Call the add() method for integer values and store the result
        int x = c1.add(2, 5);

        // Display the sum of two integers
        System.out.println("Sum is equal to = " + x);

        // Call the overloaded add() method for double values and store the result
        double y = c1.add(2.5, 4.5);

        // Display the sum of two double values
        System.out.println("Sum is equal to = " + y);
    }
}
