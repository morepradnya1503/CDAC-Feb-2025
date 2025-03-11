:  Write a Java program that checks whether a character is  uppercase, lowercase, or 
not a letter  using only the ternary operator. 
public class UpperLowerCase {
    public static void main(String[] args) {
        // Test characters
        char ch1 = 'A';  // Uppercase character
        char ch2 = 'z';  // Lowercase character
        char ch3 = '1';  // Non-letter character
        char ch4 = '!';  // Non-letter character
        
        // Check and print the result using ternary operators
        System.out.println(checkCharacterCase(ch1)); // Uppercase
        System.out.println(checkCharacterCase(ch2)); // Lowercase
        System.out.println(checkCharacterCase(ch3)); // Not a letter
        System.out.println(checkCharacterCase(ch4)); // Not a letter
    }

    // Method to check if the character is uppercase, lowercase, or not a letter
    public static String checkCharacterCase(char ch) {
        // Use the ternary operator with ASCII value checks
        return (ch >= 'A' && ch <= 'Z') ? "Uppercase" : 
               (ch >= 'a' && ch <= 'z') ? "Lowercase" : 
               "Not a letter";
    }
}
