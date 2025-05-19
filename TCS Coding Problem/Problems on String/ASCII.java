import java.util.Scanner;

public class ASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Character : ");
        char a = sc.next().charAt(0);
        int ascii = a;
        System.out.println("ASCII of this Character is : " + ascii);
        sc.close();
    }
}

// Time Complexity - O(1)
// Space Complexity - O(1)