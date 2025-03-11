public class LargestOfThreeNo {
    public static void main(String[] args) {
        // Initializing the three variables with values
        int x = 8, y = 4, z = 1;
        
        // Using a ternary operator to find the largest number among x, y, and z
        // First, check if x is greater than both y and z
        int res = ((x > y && x > z) ? x : // If x is largest, assign x to res
                  (y > x && y > z) ? y : // If y is largest, assign y to res
                  z);  // If neither x nor y is largest, assign z to res
        
        // Print the largest number
        System.out.println(res + " is the largest number.");
    }
}
