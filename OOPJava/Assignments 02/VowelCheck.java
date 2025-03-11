Write a program to determine if a  character is a vowel  or a consonant using the 
ternary operator.

import java.util.Scanner;
public class VowelCheck {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        
        // Prompt the user to enter a character
        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);
        
        // Use the ternary operator to check if the character is a vowel or consonant
        String result = (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                         ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') 
                         ? "Vowel" : "Consonant";
        
        // Print the result
        System.out.println(ch + " is a " + result);
          }
}
