package Program1;
import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }
    public double subtract(double a, double b) {
        return a - b;
    }
    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return Double.NaN; 
        }
        return a / b;
    }

    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add":
                return add(a, b);
            case "subtract":
                return subtract(a, b);
            case "multiply":
                return multiply(a, b);
            case "divide":
                return divide(a, b);
            default:
                System.out.println("Error: Invalid operation.");
                return Double.NaN; 
        }
    }
}

public class SmallCalculator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter first number (a): ");
        double a = scanner.nextDouble();

        System.out.print("Enter second number (b): ");
        double b = scanner.nextDouble();

        System.out.print("Enter the type of operation (add, subtract, multiply, divide): ");
        String operation = scanner.next();

        double result = calculator.calculate(a, b, operation);

        if (!Double.isNaN(result)) {
            System.out.println("The result of the operation is: " + result);
        }

        scanner.close();


	}

}
