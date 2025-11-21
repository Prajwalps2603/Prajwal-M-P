package Program_1;

public class Calculator {
	
	 public double calculate(double a, double b, String operation) {

	        switch (operation.toLowerCase()) {
	            case "add":
	                return a + b;

	            case "sub":
	                return a - b;

	            case "mul":
	                return a * b;

	            case "div":
	                if (b == 0) {
	                    System.out.println("Error: Division by zero!");
	                    return 0;
	                }
	                return a / b;

	            default:
	                System.out.println("Invalid operation!");
	                return 0;
	        }
	    }
	}
