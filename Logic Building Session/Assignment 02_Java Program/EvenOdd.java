/*Check Odd or Even Number: 
    Task: Create a flowchart to determine whether a number is odd or even. 
    Next Step: Write a Java program that checks if a predefined number is odd or even. Use 
    an if-else statement and the modulus operator (%) to determine whether the number is 
    divisible by 2 or not.*/


class EvenOdd {
    public static void main(String[] args) {

        int num= 10;

         // Checking if number is even or odd number using remainder
             if (num % 2 == 0) 
 
            // If remainder is zero then this number is even
            System.out.println("Entered Number is Even");
        
        else 
 
            // If remainder is not zero then this number is odd
            System.out.println("Entered Number is Odd");
            }
}
        
