public class PalindromeString {

    public static boolean Palindromestr(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String str = "TAKE A REST BABY";
        if (Palindromestr(str)) {
            System.out.println(str + " : Palindrome");
        } else {
            System.out.println(str +" : Is not Palindrome");
        }
    }
}
