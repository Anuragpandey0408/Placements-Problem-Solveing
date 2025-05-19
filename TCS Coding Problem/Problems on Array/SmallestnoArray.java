

/* // Function based method

 public class SmallestnoArray {

    public static int sort(int[] arr1) {
        Arrays.sort(arr1);
        return arr1[0];
    }
    public static void main(String[] args) {
        int[] arr1 = {2,5,1,3,0};
        System.out.println("The smallest element in array is: " + sort(arr1));
    }
} */

// Logical method

public class SmallestnoArray {

    public static int sort(int[] arr1) {
        int min = arr1[0];
        for (int i = 1; i < arr1.length; i++) {
            if (min > arr1[i]) {
                min = arr1[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        int[] arr1 = { 2, 5, 1, 3, 0 };
        System.out.println("The smallest element in array is: " + sort(arr1));
    }
}
