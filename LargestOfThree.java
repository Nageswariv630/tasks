package tasks;

import java.util.Scanner;

public class LargestOfThree {
	   public static void main(String[] args) {
	       Scanner scanner = new Scanner(System.in);

	        // Input from the user
	        System.out.print("Enter first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.print("Enter third number: ");
	        double num3 = scanner.nextDouble();

	        double largest;

	        // Compare the numbers using if-else
	        if (num1 >= num2 && num1 >= num3) {
	            largest = num1;
	        } else if (num2 >= num1 && num2 >= num3) {
	            largest = num2;
	        } else {
	            largest = num3;
	        }

	        // Output the result
	        System.out.println("The largest number is: " + largest);

	        scanner.close();
	    }
	}

