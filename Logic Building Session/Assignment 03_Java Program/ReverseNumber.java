public class ReverseNumber {
    public static void main(String[] args) {
        int number = 1234;  // Original number
        int reversed = 0;   // Variable to store the reversed number

        // Loop until the number becomes 0
        while (number != 0) {
            int digit = number % 10;  // Get the last digit of the number
            reversed = reversed * 10 + digit;  // Build the reversed number
            number = number / 10;  // Remove the last digit from the number
        }

        // Print the reversed number
        System.out.println("Reversed Number: " + reversed);
    }
}
