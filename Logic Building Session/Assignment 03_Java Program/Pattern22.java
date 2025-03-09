public class Pattern22 {
    public static void main(String[] args) {
        int rows = 5; // Number of rows for the middle part

        // Upper half of the pattern
        for (int i = 1; i <= rows; i++) {
            // Printing spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= 2 * (rows - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower half of the pattern
        for (int i = rows - 1; i >= 1; i--) {
            // Printing spaces
            for (int j = 1; j <= i - 1; j++) {
                System.out.print(" ");
            }
            // Printing stars
            for (int k = 1; k <= 2 * (rows - i) + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
