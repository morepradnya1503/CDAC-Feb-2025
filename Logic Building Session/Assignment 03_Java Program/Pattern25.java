public class Pattern25 {
    public static void main(String[] args) {
        // Loop through rows
        for (int i = 1; i <= 5; i++) {
            // Print numbers from 1 to i in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
