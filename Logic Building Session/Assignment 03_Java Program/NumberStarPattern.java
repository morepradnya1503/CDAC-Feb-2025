public class NumberStarPattern {
    public static void main(String[] args) {
        int maxNumber = 5;

        // Upper half of the pattern
        for (int i = 1; i <= maxNumber; i++) {
            // Print numbers and stars
            for (int j = 1; j <= i; j++) {
                if (j > 1) {
                    System.out.print("*");
                }
                System.out.print(i); // Print number i
            }
            System.out.println(); // Move to the next line
        }

        // Lower half of the pattern
        for (int i = maxNumber; i >= 2; i--) {
            // Print numbers and stars
            for (int j = 1; j < i; j++) {
                System.out.print(i + "*");
            }
            System.out.println(i); // Print the last number without the star
        }
    }
}
