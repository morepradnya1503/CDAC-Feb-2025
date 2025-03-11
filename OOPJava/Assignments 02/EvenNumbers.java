/*Write a program that prints  all even numbers from 1 to 100  using only  bitwise AND 
(  &  )  and  for  loop. */

public class EvenNumbers {
    public static void main(String[] args) {
        // Use a for loop to iterate from 1 to 100
        for (int num = 1; num <= 100; num++) {
            // Check if the number is even using bitwise AND
            if ((num & 1) == 0) {
                System.out.println(num); // Print the even number
            }
        }
    }
}
