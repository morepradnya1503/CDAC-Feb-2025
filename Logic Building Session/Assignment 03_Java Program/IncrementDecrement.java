public class IncrementDecrement {
    public static void main(String[] args) {
        int i = 5;
        
        // Using both pre-increment and post-decrement operators in a single expression
        int result = ++i + i-- + ++i;
        
        // Output the results
        System.out.println("Initial value of i: 5");
        System.out.println("Result of the expression: " + result);
        System.out.println("Final value of i: " + i);
    }
}
