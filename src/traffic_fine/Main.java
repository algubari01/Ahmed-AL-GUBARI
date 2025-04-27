package traffic_fine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String driverId, driverName, plate, violation;

        // Validate National ID or license (16-digit)
        while (true) {
            System.out.print("Enter Driver National ID (16 digits): ");
            driverId = sc.nextLine();
            if (driverId.matches("\\d{16}")) break;
            System.out.println("Invalid ID. Must be 16 digits.");
        }

        // Validate driver name
        while (true) {
            System.out.print("Enter Driver Name: ");
            driverName = sc.nextLine();
            if (driverName.matches("[A-Za-z ]+")) break;
            System.out.println("Name must contain letters only.");
        }

        // Validate vehicle plate
        while (true) {
            System.out.print("Enter Vehicle Plate (e.g., RAB123D): ");
            plate = sc.nextLine();
            if (plate.matches("[A-Z]{3}\\d{3}[A-Z]")) break;
            System.out.println("Invalid plate format.");
        }

        // Validate violation type
        while (true) {
            System.out.print("Enter Violation (SPEEDING, RED_LIGHT, NO_HELMET, DUI): ");
            violation = sc.nextLine();
            if (violation.equalsIgnoreCase("SPEEDING") || violation.equalsIgnoreCase("RED_LIGHT") ||
                    violation.equalsIgnoreCase("NO_HELMET") || violation.equalsIgnoreCase("DUI")) {
                break;
            }
            System.out.println("Invalid violation type.");
        }

        System.out.println("\n--- Recording Violation ---");
        ViolationEntry entry = new ViolationEntry(driverId, driverName, plate, violation);
        entry.recordViolation();

        System.out.println("\n--- Assessing Fine ---");
        FineAssessment fine = new FineAssessment(driverId, driverName, plate, violation);
        fine.assessFine();

        System.out.println("\n--- Processing Payment ---");
        FinePayment payment = new FinePayment(driverId, driverName, plate, violation, fine.getFineAmount(), entry.getPaymentStatus());
        payment.processPayment();

        sc.close();
    }
}
