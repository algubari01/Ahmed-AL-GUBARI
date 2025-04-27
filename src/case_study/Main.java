package case_study;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String contractorId;
        String contractorName;
        double quantity;

        // Validate Contractor ID (numeric only)
        while (true) {
            System.out.print("Enter Contractor ID (numbers only): ");
            contractorId = input.nextLine().trim();
            if (contractorId.matches("\\d+")) {
                break;
            } else {
                System.out.println("Invalid ID. please enter numbers only.");
            }
        }

        // Validate Contractor Name (letters and spaces only)
        while (true) {
            System.out.print("Enter Contractor Name: ");
            contractorName = input.nextLine().trim();
            if (contractorName.matches("[A-Za-z ]+")) {
                break;
            } else {
                System.out.println("Invalid name. Please use only letters and spaces.");
            }
        }

        // Validate Material Quantity
        while (true) {
            System.out.print("Enter Material Quantity (in tons): ");
            if (input.hasNextDouble()) {
                quantity = input.nextDouble();
                if (quantity > 0) {
                    break;
                } else {
                    System.out.println("Quantity must be greater than zero. Try again.");
                }
            } else {
                System.out.println("Invalid input. Please enter a numeric value.");
                input.next(); // consume the invalid input
            }
        }

        // Initial material balance (you can load this from DB later)
        double initialBalance = 10.0;

        System.out.println("\n=== Material Delivery ===");
        MaterialDelivery delivery = new MaterialDelivery(contractorId, contractorName, quantity, initialBalance);
        delivery.receiveMaterial();

        System.out.println("\n=== Material Usage ===");
        MaterialUsage usage = new MaterialUsage(contractorId, contractorName, quantity, delivery.getMaterialBalance());
        usage.useMaterial();

        System.out.println("\n=== Cost Estimation ===");
        CostEstimation estimation = new CostEstimation(contractorId, contractorName, quantity, usage.getMaterialBalance());
        estimation.estimateCost();

        input.close();
    }
}
