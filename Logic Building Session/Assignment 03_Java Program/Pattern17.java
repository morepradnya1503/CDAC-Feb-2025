public class Pattern17 {
    public static void main(String[] args) {
        int n = 5; // The number of rows
        
        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            
            // Print stars
            for (int k = 0; k < (n - i); k++) {
                System.out.print("*");
            }
            
            // Move to the next line after each row
            System.out.println();
        }
    }
}
