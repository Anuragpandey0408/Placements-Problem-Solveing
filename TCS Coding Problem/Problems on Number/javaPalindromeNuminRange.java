public class javaPalindromeNuminRange {

    public static boolean isPalindrome(int n) {
        int reverseNum = 0;
        int duplicateNum = n;

        while (n > 0) {
            int lastDigit = n % 10;
            reverseNum = (reverseNum * 10) + lastDigit;
            n = n / 10;
        }
        if (duplicateNum == reverseNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int min = 10;
        int max = 50;
        for (int i = min; i <= max; i++) {
            if (isPalindrome(i)) {
                System.out.println(i + " is palindrome number");
            }
        }
    }
}
