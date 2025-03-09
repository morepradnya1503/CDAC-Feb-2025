/*Flowchart + Java Program Questions

1. Check Positive Number: 
2. Check Negative Number: 
•	Task: Create a flowchart to check whether a number is positive. 
•	Next Step: Write a Java program that checks if a predefined number is 
                   positive and Negative using an if-else statement and prints the appropriate message.*/

class PositiveNegative {

    public static void main(String[] args) {

        double number = 12.3;

        // if number is less than 0 then no is negative
        if (number < 0.0)
            System.out.println(number + " is a negative number.");

        // true if number is greater than 0 then no is positive
        else if ( number > 0.0)
            System.out.println(number + " is a positive number.");

        // if both test expression calculate then statement is to and no is 0
        else
            System.out.println(number + " is 0.");
    }
}
       
          
        
    