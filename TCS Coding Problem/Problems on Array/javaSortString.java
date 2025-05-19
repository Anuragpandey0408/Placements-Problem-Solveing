/* 

// Approach 1 : Arrays Sort Method (Inbuilt Method)
// In this approach, we will use the inbuilt sort method of the Arrays class to sort the string.

import java.util.*;

public class javaSortString {
    public static void main(String[] args) {
        String str = "zxcbg";
        int n = str.length();
        System.out.println("After sorting : " + solve(str, n));
    }
    public static String solve(String str, int n) {
        char[] arr = str.toCharArray();
        Arrays.sort(arr);
        return new String(arr);
    }
}

// Output: After sorting : bcgxz
// Complexity Analysis:
// Time Complexity: O(nlogn), where n is the length of the string.
// Space Complexity: O(n), where n is the length of the string.

*/

// Approach 2 : Bubble Sort Method 


public class javaSortString {
    public static void main(String[] args) {
        String str = "zxcbg";
        int n = str.length();
        System.out.println("After sorting : " + solve(str, n));
    }
    public static String solve(String str, int n) {
        char[] arr = str.toCharArray();
        // Bubble Sort
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] =  temp;
                }
            }
        }
        return new String(arr);
    }
}
// Output: After sorting : bcgxz
// Complexity Analysis:
// Time Complexity: O(n^2), where n is the length of the string.
// Space Complexity: O(n), where n is the length of the string.
