import java.util.Arrays;

public class ReverseArray {
    public static void reverseArray(int arr[], int n) {
        int ans[] = new int[n];
        for(int i = n-1; i >= 0; i--) {
            ans[n-i-1] = arr[i]; // 5-4-1 = 0th index store arr[4] -> 1 store
        }
// Arrays.toString(ans) converts the array to a readable string like [1, 2, 3, 4, 5]
// System.out.println(ans) : give us to memory address

        System.out.println(Arrays.toString(ans)); 
    }
    public static void main(String[] args) {
        int arr[] = {5,4,3,2,1};
        int n = 5;
        reverseArray(arr, n);
    }
}
