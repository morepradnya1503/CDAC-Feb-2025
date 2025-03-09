/*Find the Largest of Three Numbers: 
    Task: Create a flowchart to find the largest of three numbers. 
    Next Step: Write a Java program that finds and prints the largest of three predefined 
    numbers using if-else statements.*/

class largest3 {
            public static void main(String args[])
                {

                   int a=7, b=4, c=9;//predefine value this may change
                   if (a>=b && b>=c)
                   System.out.println("The largest number is: " + a);

                   else if (b>=a && b>=c)
                   System.out.println("The largest number is: " + b);
              
                   else 
                   System.out.println("The largest number is: " + c);

                

}


}