// Define a class named Calculator
public class Calculator {

    // Declare two integer instance variables
    int a, b;

    // Default constructor
    // Initializes a and b with default value 0
    Calculator() {
        a = 0;
        b = 0;
    }

    // Parameterized constructor
    // Initializes a and b with the values passed by the user
    Calculator(int i, int j) {
        a = i;
        b = j;
    }

    // Method to add two integer numbers
    int add(int p, int q) {
        return p + q;
    }

    // Overloaded method to add two double numbers
    double add(double p, double q) {
        return p + q;
    }
}
