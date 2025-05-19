import java.util.Scanner;

public class ChainMarketingOrg {
    public static void main(String[] args) {
        // Scanner object to read input
        Scanner sc = new Scanner(System.in);

        // Parent member ka naam read kiya
        String parent = sc.nextLine().trim();

        // Check kiya ki parent member ke child member hai ya nahin
        String hasChild = sc.nextLine().trim();

        // Total member ka count track karne ke liye variable banaya
        int totalMembers = 1;
        int parentCommision = 0;

        // Agar parent member ke child members hain
           // Comma Separated Names Split Kiye
        String childInput = sc.nextLine().trim();
        String[] children = childInput.split(",");

        // Total Members Count Update Kiya
        totalMembers = totalMembers + children.length;

        // Parent Commission Calculate Kiya
        parentCommision = children.length * 500;

        // Output print karte hain
          // Agar Parent ke Koi Child Members Hain (Y hai)
        System.out.println("Total Members :" + totalMembers);
        System.out.println("Comission Details :" + parent + " " + parentCommision + "INR");
        for (String child : children) {
            System.out.println(child.trim() + "250 INR");
        }
          // Agar Parent ke Koi Child Members Nahi Hain (N hai)
          parentCommision = 250;
          System.out.println("Total Members: " + totalMembers);
          System.out.println("Commission Details");
          System.out.println(parent + ": " + parentCommision + " INR");
          
        sc.close();
    }
}
