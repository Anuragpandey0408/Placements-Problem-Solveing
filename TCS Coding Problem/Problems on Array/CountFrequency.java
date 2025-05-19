public class CountFrequency {
    public static void countFreq(int arr[], int n) {
        boolean visited[] = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visited[i] = true) // If already visited, skip
                continue;

            int count = 1; // Count the current element

            for (int j = i + 1; j < n; j++) { // Start from i+1
                if (arr[i] == arr[j]) {
                    visited[j] = true; // Mark as visited
                    count++;
                }
            }
            System.out.println(arr[i] + " - " + count + " times"); // Print result
        }
    }

    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        countFreq(arr, n);
    }
}


