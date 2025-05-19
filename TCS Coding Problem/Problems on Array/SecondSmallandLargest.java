

public class SecondSmallandLargest {

    public static int smallest (int arr[]) {
        int min = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    public static int largest (int arr[]) {
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[] = {8,10,5,7,9};
        System.out.println("Smallest Element in Array : "+smallest(arr));
        System.out.println("Largest Element in Array : "+largest(arr));
    }
}
