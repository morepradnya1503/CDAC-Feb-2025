public class LargestDigit {
    public static void main(String[] args) {
        int number = 4825;
        int largestDigit = 0;

        // Loop to extract each digit and find the largest
        while (number != 0) {
            int digit = number % 10;  // Get the last digit
            if (digit > largestDigit) {
                largestDigit = digit;  // Update largest digit if current digit is greater
            }
            number /= 10;  // Remove the last digit
        }

        // Output the largest digit
        System.out.println("The largest digit is: " + largestDigit);
    }
}
