//7. Write a Java program that takes a number as input and prints its multiplication table up to 10

import java.util.Scanner;

public class MultiplicationTable {
    
          public static void main(String args[]){

          //Scanner object to read i/p from the user
          Scanner in = new Scanner(System.in);
  
         //Take i/p no to print Multiplication Table
         System.out.print("Enter number for Multiplication Table: ");
 
        //Read and store the i/p number
        int num = in.nextInt();

       //Use loop for calculation and print multiplication Table
       for(int i= 0; i<10; i++)
           {

             //Calculate and print Multiplicatin Table
             System.out.println(num + "x" + (i+1) + "=" + (num * (i+1)));

            }
 }      
     
}