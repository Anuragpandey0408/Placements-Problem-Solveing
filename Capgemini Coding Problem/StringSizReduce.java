import java.util.Scanner;

public class StringSizReduce {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        int n = str.length();
        int count = 1;
        for(int i = 0; i < n; i++) {
            if(i < n-1 && str.charAt(i) == str.charAt(i + 1)) {
                count ++;
            }
            else {
                result.append(str.charAt(i));
                if (count > 1) {
                    result.append(count);
                }
                count = 1;
            }
        }
        System.out.println(result.toString());
        sc.close();

    }
}
