package Program_1;

import java.util.Scanner;

public class main {

	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter value of a: ");
	        double a = sc.nextDouble();

	        System.out.print("Enter value of b: ");
	        double b = sc.nextDouble();

	        System.out.print("Enter operation (add/sub/mul/div): ");
	        String operation = sc.next();

	        Calculator calc = new Calculator();
	        double result = calc.calculate(a, b, operation);

	        System.out.println("Result: " + result);

	        sc.close();
	    }
	}