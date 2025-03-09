public class Pattern2 {
    public static void main(String[] args) {
        int rows = 5;  // You can adjust the number of rows here
        
        for (int i = 1; i <= rows; i++) {
            // Print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();  // Move to the next line
        }
    }
}
