public class PalindromeinRange {
    public static boolean palindrome(int num) {
        int revNum = 0, dup = num;
        while (num > 0) {
            int lastDig = num % 10;
            revNum = revNum * 10 + lastDig;
            num = num / 10;
        }
        if (dup == revNum) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int min = 20;
        int max = 40;
        for(int i = min; i <= max; i++) {
            if (palindrome(i)) {
                System.out.println(i + " ");
            }
        } 
    }
}
