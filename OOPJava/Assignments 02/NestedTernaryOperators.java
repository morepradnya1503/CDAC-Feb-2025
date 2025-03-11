public class NestedTernaryOperators {
    public static void main(String[] args) {
        // Calling the minfour method with four integer arguments
        minfour(1, 2, 3, 4);
    }

    // Method to find the minimum of four numbers using nested ternary operators
    public static void minfour(int x, int y, int z, int m) {
        // Using nested ternary operators to find the minimum of the four numbers
        int res = (x < y && x < z && x < m) ? x : // Check if x is the smallest
                  (z < y && z < x && z < m) ? z : // If x is not the smallest, check if z is the smallest
                  (y < z && y < x && y < m) ? y : // If neither x nor z is the smallest, check if y is the smallest
                  m;  // If none of the above are the smallest, m must be the smallest

        // Print the minimum value
        System.out.println(res);
    }
}
