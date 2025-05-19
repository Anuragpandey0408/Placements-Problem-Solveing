import java.util.Arrays;

public class ReverseArrayTwoPointer {
    public static void revArrayTwoPointer(int arr[], int n) {
        int p1 = 0, p2 = n - 1;
        while (p1 < p2) {
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++;
            p2--;
        }
        System.out.println("Reverse Array : " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int arr[] = { 10, 20, 30, 40 };
        int n = arr.length;
        revArrayTwoPointer(arr, n);
    }
}
