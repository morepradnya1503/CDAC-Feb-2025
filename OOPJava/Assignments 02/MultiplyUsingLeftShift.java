public class MultiplyUsingLeftShift {
    public static void main(String[] args) {
        // Calling the check method with different integer values
        check(7);   // Will multiply 7 by 8 using left shift
        check(20);  // Will multiply 20 by 8 using left shift
        check(-9);  // Will multiply -9 by 8 using left shift
    }
    
    // Method to multiply a number by 8 using bitwise left shift (<<)
    public static void check(int a) {
        // Perform a left shift by 3 positions (equivalent to multiplying by 8)
        int result = a << 3;  
        
        // Print the result of the left shift operation
        System.out.println(result);  
    }
} 
