public class javaRootQuadraticEquation {

    public static void Root(int a, int b, int c) {
        if (a == 0) {
            System.out.println("Invalid");
            return;
        }
        int d = b * b - 4 * a * c;
        double sqrt_val = Math.sqrt(Math.abs(d));

        if (d > 0) {
            System.out.println("Roots are real and different \n");
            double r1 = (double)(-b + sqrt_val) / (2 * a);
            double r2 = (double)(-b - sqrt_val) / (2 * a);
            System.out.println(r1 + "\n" + r2);
        } else if (d == 0) {
            System.out.println("Roots are real and same ");
            double root = -(double)b / (2 * a);
            System.out.println(root + "\n" + root);
        } else { // d < 0
            System.out.println("Roots are complex ");
            System.out.println(-(double)b / (2 * a) + " + i" + sqrt_val / (2 * a) + "\n" +
                               -(double)b / (2 * a) + " - i" + sqrt_val / (2 * a));
        }
    }

    public static void main(String[] args) {
        int a = 1, b = -3, c = -10;
        Root(a, b, c);
    }
}