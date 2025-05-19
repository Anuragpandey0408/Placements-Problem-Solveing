public class javaCheckPrime {
    public static boolean isPrime(int num) {
        // Initialize a counter variable to count factors
        int count = 0;
        // Loop through numbers from 1 to num
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                // Increment count if num is divisible by i
                count = count + 1;
            }
        }
        // If count is 2, the number is prime
        return count == 2;
    }

    public static void main(String[] args) {
        int num = 5; // Input number to check
        if (isPrime(num)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
