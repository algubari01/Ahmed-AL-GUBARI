package traffic_fine;

import java.util.Arrays;
import java.util.List;

public class ViolationEntry extends TrafficRecord {
    private static final List<String> allowedViolations = Arrays.asList("SPEEDING", "RED_LIGHT", "NO_HELMET", "DUI");

    public ViolationEntry(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void recordViolation() {
        if (allowedViolations.contains(violationType.toUpperCase())) {
            System.out.println("✅ Violation recorded:");
            System.out.println("Driver: " + driverName);
            System.out.println("Violation: " + violationType);
            System.out.println("Vehicle Plate: " + vehiclePlate);
            System.out.println("Status: " + paymentStatus);
        } else {
            System.out.println("Invalid violation type.");
        }
    }

    @Override
    public void assessFine() {}

    @Override
    public void processPayment() {}
}
