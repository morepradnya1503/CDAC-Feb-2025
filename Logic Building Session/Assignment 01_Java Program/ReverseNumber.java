//Reverse a Number
import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Initialize a variable to store the reversed number
        int reversedNumber = 0;

        // Loop to reverse the digits of the number
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            reversedNumber = reversedNumber * 10 + digit;  // Add digit to the reversed number
            number = number / 10;  // Remove the last digit from the number
        }

        // Output the reversed number
        System.out.println("The reverse of the number is: " + reversedNumber);

        // Close the scanner
        scanner.close();
    }
}
