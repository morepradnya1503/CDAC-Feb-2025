//Check Whether a Number Is Prime

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Create a scanner object to take user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();

        // Initialize a variable to store the factorial result
        long factorial = 1;

        // Calculate the factorial of the number using a for loop
        for (int i = 1; i <= num; i++) {
            factorial *= i; // Multiply factorial by the current number
        }

        // Output the factorial
        System.out.println("The factorial of " + num + " is: " + factorial);

        // Close the scanner
        scanner.close();
    }
}

