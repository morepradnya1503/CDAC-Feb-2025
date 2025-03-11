/*Q7:  Implement a Java program that checks whether a given year is a  leap year or not 
 using logical (  &&  ,  ||  ) operators.*/

import java.util.Scanner;  // Importing the Scanner class to read input from the user

public class LeapYear {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Read an integer input from the user, which represents the year
        int y = sc.nextInt(); 
        
        // Check if the year is a leap year using the given conditions
        // A year is a leap year if:
        // - It is divisible by 400, or
        // - It is divisible by 4 but not divisible by 100
        if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0)) 
            // If the conditions are true, print that the year is a leap year
            System.out.println(y + " is a leap year.");
        else 
            // If the conditions are false, print that the year is not a leap year
            System.out.println(y + " is not a leap year.");
    }
}
