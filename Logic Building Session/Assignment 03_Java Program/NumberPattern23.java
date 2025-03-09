public class NumberPattern23 {
    public static void main(String[] args) {
        // Loop through rows
        for (int i = 1; i <= 5; i++) {
            // Loop through columns
            for (int j = 1; j <= 5; j++) {
                System.out.print(i);  // Print the current row number
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
