package calculator;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("===== Calculator ======");
		System.out.println("Operations: + (Add) , - (Sub), x (Mul), / (Div)");
		System.out.println();
		
		// Get first number 
		System.out.println("Enter first number: ");
		double num1 = scanner.nextDouble();
		
		// Get operator 
		System.out.println("Enter the operator: ");
		char operator = scanner.next().charAt(0);
		
		// Get second number 
		System.out.println("Enter second number: ");
		double num2 = scanner.nextDouble();
		
		double result = 0;
		boolean validOperation = true;
		
		
		// Perform calculations 
		switch(operator) {
			case '+' :
				result = num1 + num2 ;
				break;
			case '-' :
				result = num1 - num2;
				break;
			case 'x' :
				result = num1 * num2;
				break;
			case '/' : 
				if(num2 !=0 ) {
					result = num1 / num2;
				}else {
					System.out.println("Division by Zero is not allowed !!!");
					validOperation = false;
					
				}
				break;
			default : 
				System.out.println("Error: Invalid operator! Please use +, -, *, or /");
				validOperation = false;
				break;				
		}
		if(validOperation) {
			System.out.println();
			System.out.println("Result : " + num1 + " " + operator + " " + num2 + " = " + result);
		}
	}
}
