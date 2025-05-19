import java.util.Scanner;

public class javaCharPalindrome {
    public static boolean isPalindrome(String str) {
		//Your code goes here
		int i = 0;
		int j = str.length() - 1;

		while (i < j){
			if (str.charAt(i) != str.charAt(j)) {
				return false;
			}
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
		String str = sc.nextLine();
		//String str = "abcdcba";
		System.out.println(isPalindrome(str));
		sc.close();
	}

}