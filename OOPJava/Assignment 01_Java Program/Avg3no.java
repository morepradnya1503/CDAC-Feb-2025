//Write a program to demonstrate binary, octal, hexadecimal, and floating-point literals in Java.



public class NumberLiterals {
    public static void main(String[] args) {
        // Binary literal
        int binaryNumber = 0b1010;  // 10 in binary
        System.out.println("Binary literal (0b1010): " + binaryNumber);

        // Octal literal
        int octalNumber = 012;  // 10 in octal
        System.out.println("Octal literal (012): " + octalNumber);

        // Hexadecimal literal
        int hexNumber = 0xA;  // 10 in hexadecimal
        System.out.println("Hexadecimal literal (0xA): " + hexNumber);

        // Floating-point literals
        float floatNumber = 3.14f;  // 'f' indicates float type
        double doubleNumber = 3.14159;  // Default type is double
        System.out.println("Floating-point literal (float): " + floatNumber);
        System.out.println("Floating-point literal (double): " + doubleNumber);
    }
}

















