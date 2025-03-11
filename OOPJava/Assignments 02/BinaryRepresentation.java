//:  Implement a program to swap  odd and even bits  of a number using bitwise 
//operators. Hint  : Use masks:  (x & 0xAAAAAAAA) >> 1 | (x & 0x55555555) << 1

public class SwapOddEvenBits {
    public static void main(String[] args) {
        // Test cases: Calling swapper method with different numbers
        swapper(10); // 10 in binary: 00001010
        swapper(9);  // 9 in binary: 00001001
    }

    // Method to swap odd and even bits of the number
    public static void swapper(int x) {
        // Get even bits (bit positions 0, 2, 4, 6...) and shift them right by 1 position
        int evenBits = (x & 0xAAAAAAAA) >> 1;
        // Get odd bits (bit positions 1, 3, 5, 7...) and shift them left by 1 position
        int oddBits = (x & 0x55555555) << 1;
        
        // Combine the shifted even and odd bits using bitwise OR
        int res = (evenBits | oddBits);
        
        // Print the result of the bit swap
        System.out.println(res);
    }
}
