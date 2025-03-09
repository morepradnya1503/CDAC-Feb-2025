public class PrimeNumbers {
    // Function to check if a number is prime or not
    public static boolean isPrime(int N) {
        for (int i = 2; i < N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Main function
    public static void main(String[] args) {
        // Variable to store the number of primes printed so far
        int cnt = 0;
        // Variable to store the number to be checked for prime
        int num = 2;

        // Iterate until we have printed the first 10 primes
        while (cnt < 5) {
            // Prime Check
            if (isPrime(num)) {
                System.out.println(num);
                cnt++;
            }
            num++;
        }
    }
}
