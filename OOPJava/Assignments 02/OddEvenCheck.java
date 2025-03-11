//Given a number, find whether it is  odd or even  using the  &  bitwise operator 
//and print the result without using  if-else  . 

public class OddEvenCheck {
    public static void main(String[] args) {
        // Example input
        int num = 7;

        // Using bitwise AND to check if the number is even or odd
        System.out.println((num & 1) == 0 ? "Even" : "Odd");
    }
}
