public class NthPrime {
    public static void main(String[] args) {
        int n = 10; // Change this value to find the nth prime number
        int nthPrime = findNthPrime(n);
        System.out.println(n + "th prime number is: " + nthPrime);
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) return false;
        if (num == 2 || num == 3) return true;
        if (num % 2 == 0 || num % 3 == 0) return false;

        // Check for prime by testing divisibility up to sqrt(num)
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }

    // Function to find the nth prime number
    public static int findNthPrime(int n) {
        int count = 0; // Counter for prime numbers
        int num = 1;   // Number to be checked

        // Loop until we find the nth prime
        while (count < n) {
            num++;
            if (isPrime(num)) {
                count++;
            }
        }
        return num; // Return the nth prime number
    }
}
