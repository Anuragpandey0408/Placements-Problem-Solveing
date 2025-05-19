public class Palindrome {
    public static int palindrome(int num) {
        int revNum = 0, dup = num;
        while (num > 0) {
            int lastDig = num % 10;
            revNum = revNum * 10 + lastDig;
            num = num / 10;
        }
        if (dup == revNum) {
            System.out.println("Num is Palindrome");
        } else {
            System.out.println("Num isn't Palindrome");
        }
        return revNum;
    }

    public static void main(String[] args) {
        int num = 121;
        palindrome(num);
    }
}
