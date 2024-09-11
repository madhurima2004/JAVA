import java.util.ArrayList;
import java.util.List;

public class UniquePrimeFactors {
    public static void main(String[] args) {
        int N = 60; // Example input, change this value to test with other numbers
        List<Integer> primeFactors = findUniquePrimeFactors(N);
        
        System.out.println("Unique prime factors of " + N + ": " + primeFactors);
    }

    // Function to find the unique prime factors of a number N
    public static List<Integer> findUniquePrimeFactors(int N) {
        List<Integer> primeFactors = new ArrayList<>();
        
        // Check for number of 2s that divide N
        if (N % 2 == 0) {
            primeFactors.add(2);
            while (N % 2 == 0) {
                N /= 2;
            }
        }
        
        // Check for odd numbers starting from 3
        for (int i = 3; i * i <= N; i += 2) {
            if (N % i == 0) {
                primeFactors.add(i);
                while (N % i == 0) {
                    N /= i;
                }
            }
        }
        
        // This condition is to check if N is a prime number greater than 2
        if (N > 2) {
            primeFactors.add(N);
        }
        
        return primeFactors;
    }
}
