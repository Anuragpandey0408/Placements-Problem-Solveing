
public class LargestnoElement {

    public static int largestElement(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {220, 500, 720 , 150, 72, 77};
        System.out.println("Largest Element in Array :" +largestElement(arr));
    }
}
