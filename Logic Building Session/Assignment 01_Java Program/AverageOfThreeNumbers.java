//Calculate the Average of Three Numbers

import java.util.Scanner;

public class AverageOfThreeNumbers {
    public static void main(String[] args) {
        // Create a scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter three numbers
        System.out.print("Input first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Input second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Input third number: ");
        double num3 = scanner.nextDouble();

        // Calculate the average of the three numbers
        double average = (num1 + num2 + num3) / 3;

        // Output the average
        System.out.println("The average is: " + average);

        // Close the scanner
        scanner.close();
    }
}
