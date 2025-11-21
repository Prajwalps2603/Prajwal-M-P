package Program_3;

import java.util.Scanner;

public class Series {

	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a number: ");
	        int a = sc.nextInt();

	        // Determine how many odd numbers to print
	        int count = (a % 2 == 0) ? a - 1 : a;

	        // Print first 'count' odd numbers
	        int odd = 1;
	        for (int i = 1; i <= count; i++) {
	            System.out.print(odd);

	            if (i < count) {
	                System.out.print(", ");
	            }

	            odd += 2;
	        }

	        sc.close();
	    }
	}