public class SqureRoot {
    public static int squreRoot(int n) {
        int i = 0;
        while (i * i <= n) { // 0 * 0 - 1 * 1 - (2 * 2 <= 4) so o/p is 2
            i++;
        }
        return i - 1; // last value befonr squre exceed 1;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(squreRoot(n));
    }
}
