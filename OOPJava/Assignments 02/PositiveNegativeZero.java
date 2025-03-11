public class PositiveNegativeZero {
    public static void main(String[] args) {
        int num = -5; // You can change this value to test with different numbers

        // Using ternary operator to determine if the number is positive, negative, or zero
        String result = (num > 0) ? "Positive" : (num < 0) ? "Negative" : "Zero";

        // Print the result
        System.out.println("The number " + num + " is " + result);
    }
}
