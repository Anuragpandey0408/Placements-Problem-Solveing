import java.util.Scanner;

public class EstCostPaintingProperty {
    public static void main(String[] args) {
        // Input Scanner Create Kiya
        Scanner sc = new Scanner(System.in);

        // Interior aur Exterior Walls ki Count Read Ki
        System.out.println("Enter the number of interior walls:");
        int numInteriors = sc.nextInt();
        System.out.println("Enter the number of exterior walls:");
        int numExteriors = sc.nextInt();

        // Dono Walls ka Cost Track Karne ke liye Variables Declare Kiye
        double totalInteriorCost = 0;
        double totalExteriorCost = 0;

        // Interior Walls ke Surface Areas Input Liye & Cost Calculate Ki
        for (int i = 0; i < numInteriors; i++) {
            System.out.println("Enter the surface area of interior wall " + (i + 1) + ":");
            double area = sc.nextDouble();
            totalInteriorCost = totalInteriorCost + area * 18;
        }

        // Exterior Walls ke Surface Areas Input Liye & Cost Calculate Ki
        for (int i = 0; i < numExteriors; i++) {
            System.out.println("Enter the surface area of exterior wall " + (i + 1) + ":");
            double area = sc.nextDouble();
            totalExteriorCost = totalExteriorCost + area * 12;
        }

        // Total Cost Calculate Kiya
        double totalCost = totalInteriorCost + totalExteriorCost;

        System.out.printf("Total estimated Cost : %.1f INR\n", totalCost);

        sc.close();
    }
}
