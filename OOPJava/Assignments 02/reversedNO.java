/*Implement a program that reverses an  integer number  without using string 
conversion (  StringBuilder  or  toCharArray  ). 
Hint  : Use  while(n!=0) { rev = rev * 10 + n % 10; n /= 10; */


public class reversedNO {
    // Main method where the program execution begins
    static public void main(String me[]) {
        // Initialize the number to be reversed (x) and a variable to store the reversed number (rev)
        int x = 1534, rev = 0;
        
        // Store the original value of x to use it later in the output (temp)
        int temp = x;
        
        // Loop until the number x becomes 0
        while(x != 0) {
            // Extract the last digit of x and add it to the reversed number
            rev = rev * 10 + x % 10;
            
            // Remove the last digit from x by performing integer division by 10
            x = x / 10;
        }
        
        // Print the result: the original number and its reversed version
        System.out.println("Reverse of " + temp + " is " + rev);
    }
}
