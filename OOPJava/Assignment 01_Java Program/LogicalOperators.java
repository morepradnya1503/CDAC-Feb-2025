/*Write a program to check if a number is positive and even 
using logical operators (&&, ||, !).*/


class LogicalOperators {
    public static void main(String[] args) {
        // Directly assigning a number to check
        int number = 6;  // You can change this number to test other cases
        
        // Check if the number is positive and even using logical NOT (!) operator
        if (!(number <= 0) && !(number % 2 != 0)) {
            System.out.println(number + " is positive and even.");
        } else {
            System.out.println(number + " is either not positive or not even.");
        }
    }
}
