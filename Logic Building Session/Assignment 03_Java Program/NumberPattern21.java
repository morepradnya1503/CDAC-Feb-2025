public class NumberPattern21 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows
        int number = 1; // Starting number
        
        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop to print numbers and stars
            for (int j = 1; j <= i; j++) {
                System.out.print(number); // Print the current number
                if (j < i) {
                    System.out.print("*"); // Print '*' if not the last number in the row
                }
                number += 2; // Increment number by 2
            }
            System.out.println(); // Move to the next line after each row
            number = 1; // Reset the starting number for each row
        }
    }
}
