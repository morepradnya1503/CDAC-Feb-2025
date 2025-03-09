public class AssignmentOperatorsDemo {
    public static void main(String[] args) {
        // Declare and initialize two integers
        int num1 = 10;
        int num2 = 5;
        
        // Using the assignment operator (=)
        num1 = num2;  // Assign the value of num2 to num1
        System.out.println("After num1 = num2, num1 = " + num1 + ", num2 = " + num2);
        
        // Using the addition assignment operator (+=)
        num1 += num2;  // num1 = num1 + num2
        System.out.println("After num1 += num2, num1 = " + num1 + ", num2 = " + num2);
        
        // Using the subtraction assignment operator (-=)
        num1 -= num2;  // num1 = num1 - num2
        System.out.println("After num1 -= num2, num1 = " + num1 + ", num2 = " + num2);
        
        // Using the multiplication assignment operator (*=)
        num1 *= num2;  // num1 = num1 * num2
        System.out.println("After num1 *= num2, num1 = " + num1 + ", num2 = " + num2);
        
        // Using the division assignment operator (/=)
        num1 /= num2;  // num1 = num1 / num2
        System.out.println("After num1 /= num2, num1 = " + num1 + ", num2 = " + num2);
        
        // Using the modulus assignment operator (%=)
        num1 %= num2;  // num1 = num1 % num2
        System.out.println("After num1 %= num2, num1 = " + num1 + ", num2 = " + num2);
    }
}
