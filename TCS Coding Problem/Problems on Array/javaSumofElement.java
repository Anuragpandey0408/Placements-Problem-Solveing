public class javaSumofElement {
    public static void main(String[] args) {
        int n = 5;
        int arr[] = { 1, 2, 3, 4, 5 };
        int sum = 0;
        for (int i = 0; i <= n - 1; i++) {
            sum += arr[i]; // sum = sum + arr[i];
        }
        System.out.println("Sum of elements : " +sum);
    }
}

// Output: Sum of elements : 15
// Explanation: The sum of elements in the array is 1 + 2 + 3 + 4 + 5 = 15.
