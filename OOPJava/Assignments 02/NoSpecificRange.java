/*Q9:  Implement a Java program that checks if a number is  within a specific range (20 to 
50)  without using  if-else  . 
Hint  : Use  logical AND (  &&  ) in a print statement */


import java.util.Scanner;

public class NoSpecificRange {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        
        // Print the result based on the condition
        System.out.println(num >= 20 && num <= 50 && "Number is within the range (20 to 50).".equals("Number is within the range (20 to 50).") );
        
        
        // Close the scanner
        sc.close();
    }
}

