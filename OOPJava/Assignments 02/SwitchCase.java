import java.util.Scanner;

public class SwitchCase   {
    public static void main(String[] args) {
        // Create Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Prompt the user for the first number
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        // Prompt the user for the second number
        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        // Display the menu of operations
        System.out.println("MENU: ");
        System.out.println("1. ADDITION ");
        System.out.println("2. SUBTRACTION ");
        System.out.println("3. MULTIPLICATION ");
        System.out.println("4. DIVISION ");
        System.out.println("5. FIND REMAINDER ");
        System.out.print("Enter your Option: ");
        
        // Read the user's option
        int c = sc.nextInt();

        // Loop until the user chooses to exit (option 6)
        while (c != 6) {
            // Switch case to perform the selected operation
            switch (c) {
                case 1: // Addition case
                    System.out.println("Addition of " + a + " + " + b + " = " + (a + b));
                    break;

                case 2: // Subtraction case
                    System.out.println("Difference between " + a + " - " + b + " = " + (a - b));
                    break;

                case 3: // Multiplication case
                    System.out.println("Multiplication of " + a + " x " + b + " = " + (a * b));
                    break;

                case 4: // Division case
                    // Perform division with floating point result
                    System.out.println("Quotient in division of " + a + " / " + b + " = " + ((float) a / (float) b));
                    break;

                case 5: // Find remainder case
                    // Calculate remainder in division
                    System.out.println("Remainder in division of " + a + " and " + b + " = " + ((float) a % (float) b));
                    break;

                default: // Case for invalid options
                    System.out.println("INVALID OPTION");
                    break;
            }

            // Prompt for another option to continue or exit
            System.out.print("Enter your Option: ");
            c = sc.nextInt();
        }

        // Once the user chooses to exit, print an exit message
        System.out.println("EXITING PROGRAMMING!");
    }
}
