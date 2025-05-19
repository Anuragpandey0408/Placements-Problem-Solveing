import java.util.Arrays;

public class SegmentedSieve {
    public static void main(String[] args) {
        int L = 9, R = 20;  
        findPrimesInRange(L, R);
    }

    public static void findPrimesInRange(int L, int R) {
        int limit = (int) Math.sqrt(R) + 1;
        boolean[] is_prime_small = new boolean[limit + 1];
        Arrays.fill(is_prime_small, true);

        
        for (int i = 2; i * i <= limit; i++) {
            if (is_prime_small[i]) {
                for (int j = i * i; j <= limit; j += i) {
                    is_prime_small[j] = false;
                }
            }
        }

       
        boolean[] range_prime = new boolean[R - L + 1];
        Arrays.fill(range_prime, true);

        // For each prime <= sqrt(R), mark its multiples in range [L, R]
        for (int i = 2; i <= limit; i++) {
            if (is_prime_small[i]) {
                for (int j = Math.max(i * i, (L + i - 1) / i * i); j <= R; j += i) {
                    range_prime[j - L] = false;
                }
            }
        }

        // Print primes in range [L, R]
        for (int i = 0; i <= R - L; i++) {
            if (range_prime[i] && i + L > 1) {
                System.out.print((i + L) + " ");
            }
        }
    }
}