/* Write the program to find the HCF of two number without using recursion. */

public class javaHCF {
    public static void main(String[] args) {
        int num1 = 36 , num2 = 60 , hcf = 0;
        for(int i = 1; i <= num1 || i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i;
            }
        }
        System.out.println("The HCF of " + num1 + " and " + num2 + " is: " + hcf);
    }
}
