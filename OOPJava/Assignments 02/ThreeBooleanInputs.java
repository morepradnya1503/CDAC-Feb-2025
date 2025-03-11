public class ThreeBooleanInputs {
    public static void main(String[] args) {
        // Initializing three boolean variables x, y, and z with initial values
        boolean x = true, y = false, z = true;
        
        // Calling the check method with x, y, and z as parameters
        check(x, y, z);  // First call: x = true, y = false, z = true
        
        // Changing the values of x, y, and z
        x = true; y = false; z = false;
        
        // Calling the check method again with the updated values of x, y, and z
        check(x, y, z);  // Second call: x = true, y = false, z = false
    }
    
    // Method that checks if at least two boolean values are true
    public static void check(boolean a, boolean b, boolean c) {
        // The condition checks if at least two of the three boolean values are true
        // Using logical operators (&& for AND, || for OR)
        if ((a && (b || c)) || (c && (a || b)) || (b && (a || c))) {
            // If the condition evaluates to true, print "true"
            System.out.println("true");
        } else {
            // If the condition evaluates to false, print "false"
            System.out.println("false");
        }
    }
}
