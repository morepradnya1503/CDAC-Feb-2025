public class Pattern26 {
    public static void main(String[] args) {
        int num = 1;  // Start the number from 1

        // Loop through rows
        for (int i = 1; i <= 5; i++) {
            // Print numbers in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++;  // Increment the number after each print
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
