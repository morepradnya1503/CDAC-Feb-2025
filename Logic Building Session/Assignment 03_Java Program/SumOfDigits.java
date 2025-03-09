public class SumOfDigits {
    public static void main(String[] args) {
        int number = 9876;
        int sum = 0;

        // Loop to extract each digit and add it to sum
        while (number != 0) {
            sum += number % 10;  // Get the last digit
            number /= 10;         // Remove the last digit
        }

        // Output the sum of digits
        System.out.println("The sum of the digits is: " + sum);
    }
}
