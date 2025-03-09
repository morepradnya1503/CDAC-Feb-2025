//Count the Number of Digits in a Number

//Write a Java program that counts the number of digits in a given number.

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        // Initialize a variable to count digits
        int count = 0;

        // Handle the case when the number is zero
        if (number == 0) {
            count = 1;
        } else {
            // Loop through the number to count digits
            while (number != 0) {
                number /= 10;  // Divide the number by 10 in each iteration
                count++;  // Increase the count of digits
            }
        }

        // Display the result
        System.out.println("The number has " + count + " digits.");

        // Close the scanner object
        scanner.close();
    }
}
