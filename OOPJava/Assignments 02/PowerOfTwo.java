
import java.util.Scanner;

public class PowerOfTwo {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Check if the number is a power of 2 using the bitwise operator
        boolean isPowerOfTwo = (n > 0) && (n & (n - 1)) == 0;
        
        // Output the result
        if (isPowerOfTwo) {
            System.out.println(n + " is a power of 2.");
        } else {
            System.out.println(n + " is not a power of 2.");
        }
        
        // Close the scanner
        sc.close();
    }
}
