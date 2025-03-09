public class Pattern24 {
    public static void main(String[] args) {
        // Loop through rows
        for (int i = 1; i <= 5; i++) {
            // Loop through columns for each row
            for (int j = 1; j <= i; j++) {
                // Print the number i
                System.out.print(i);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
