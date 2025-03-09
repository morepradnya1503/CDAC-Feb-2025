//Celsius To Fahrenheit
import java.util.Scanner;

public class CelsiusToFahrenheit {
    public static void main(String[] args) {
        // Create a scanner object to get input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Celsius
        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        // Convert Celsius to Fahrenheit using the formula
        double fahrenheit = (celsius * 9/5) + 32;

        // Display the result
        System.out.println(celsius + "°C is equal to " + fahrenheit + "°F");
        
        // Close the scanner object
        scanner.close();
    }
}
