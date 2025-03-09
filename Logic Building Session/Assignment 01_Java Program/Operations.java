//Basic Arithmetic Operations with 2 numbers

import java.util.Scanner;

public class Operations {
 
     public static void main(String args[])

    {
        //Create a Scanner object to read i/p from the user
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        //Read and store the 1st no.  
        int num1 = in.nextInt();

        System.out.print("Enter second number: ");
        //Read and store the 1st no.
        int num2 = in.nextInt();
    
        //Addition of two numbers
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
         
         // Substrction of numbers
         System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
        
        //Multiplication of two number 
        System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
        
        // division of two numbers
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));

        // remainder of the division of two numbers
        System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
    }
}