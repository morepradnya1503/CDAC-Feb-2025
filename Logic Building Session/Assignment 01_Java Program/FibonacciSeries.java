//Print the Fibonacci Series

public class FibonacciSeries {
    public static void main(String[] args) {
        // Initialize the first two numbers of the Fibonacci series
        int n = 10;
        int num1 = 0, num2 = 1;

        System.out.print("Fibonacci series up to the 10th number: ");
        
        // Print the Fibonacci series up to the 10th number
        for (int i = 1; i <= n; i++) {
            System.out.print(num1 + " ");

            // Update the numbers for the next iteration
            int nextNum = num1 + num2;
            num1 = num2;
            num2 = nextNum;
        }
    }
}
