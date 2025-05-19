public class DecimalToBinary {
    public static void main(String[] args) {
        int deciNum = 16;
        int binary[] = new int[100];
        int i = 0;

        while (deciNum > 0) {
            binary[i] = deciNum % 2;
            deciNum = deciNum / 2;
            i++;
        }
        System.out.print("Binary number : ");
        for (int j = i - 1; j >= 0; j--)
            System.out.print(binary[j] + "");
    }
}