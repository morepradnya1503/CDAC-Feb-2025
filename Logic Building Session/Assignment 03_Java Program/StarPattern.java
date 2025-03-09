public class StarPattern {
    public static void main(String[] args) {
        // Loop through 5 rows
        for (int i = 0; i < 5; i++) {
            // Loop through 5 columns
            for (int j = 0; j < 5; j++) {
                System.out.print("*"); // Print a star
            }
            System.out.println(); // Move to the next line after printing stars in one row
        }
    }
}
