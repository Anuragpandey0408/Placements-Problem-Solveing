public class javaPalindromeNum {
    public static boolean palindromeNumber(int n) {
        int revNum = 0; // store reverse number
        int duplicateNum = n; // store duplicate number
        while (n > 0) {
            int lastDigit = n % 10; // get last digit of number
            revNum = (revNum * 10) + lastDigit; // reverse number
            n = n / 10; // remove last digit from number
        }
        if (duplicateNum == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 4334; // number imput
        System.out.println(palindromeNumber(n));
    }
}

// --->> Output true
/*
public class Solution {
    public static boolean palindromeNumber(int n) {
        int revNum = 0; // store reverse number
        int duplicateNum = n; // store duplicate number
        while (n > 0) {
            int lastDigit = n % 10; // get last digit of number
            revNum = (revNum * 10) + lastDigit; // reverse number
            n = n / 10; // remove last digit from number
        }
        if (duplicateNum == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n = 4334; // number imput
        System.out.println(palindromeNumber(n));
    }
}
 */