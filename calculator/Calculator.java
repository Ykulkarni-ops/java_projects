import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("=== Simple Calculator ===");
        System.out.println("Operations: + (addition), - (subtraction), * (multiplication), / (division)");
        System.out.println();
        
        // Get first number
        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();
        
        // Get operator
        System.out.print("Enter operator (+, -, *, /): ");
        char operator = scanner.next().charAt(0);
        
        // Get second number
        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();
        
        double result = 0;
        boolean validOperation = true;
        
        // Perform calculation using switch statement
        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    validOperation = false;
                }
                break;
            default:
                System.out.println("Error: Invalid operator! Please use +, -, *, or /");
                validOperation = false;
                break;
        }
        
        // Display result
        if (validOperation) {
            System.out.println();
            System.out.println("Result: " + num1 + " " + operator + " " + num2 + " = " + result);
        }
        
        scanner.close();
    }
}

