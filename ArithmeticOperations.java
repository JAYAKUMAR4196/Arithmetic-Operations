import java.util.Scanner; // Importing Scanner for user input

public class ArithmeticOperations {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // Handle division by zero

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
        } else {
            System.out.println("Division: Cannot divide by zero");
        }

        // Close the scanner
        scanner.close();
    }
}
