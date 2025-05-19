public class javaSearchElement {
    public static int searchElement(int arr[], int key, int n) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                return i;
            }

        }
        return -1; // Element not found in the array.
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int key = 3;
        int n = arr.length;
        System.out.println(searchElement(arr, key, n));
    }
}
