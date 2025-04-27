package traffic_fine;

public class FineAssessment extends TrafficRecord {
    public FineAssessment(String driverId, String driverName, String vehiclePlate, String violationType) {
        super(driverId, driverName, vehiclePlate, violationType);
    }

    @Override
    public void assessFine() {
        switch (violationType) {
            case "SPEEDING":
                fineAmount = 50000;
                break;
            case "RED_LIGHT":
                fineAmount = 80000;
                break;
            case "NO_HELMET":
                fineAmount = 30000;
                break;
            case "DUI":
                fineAmount = 150000;
                break;
            default:
                System.out.println("Unknown violation. Cannot assess fine.");
                return;
        }
        System.out.println("Fine Assessment:");
        System.out.println("Driver: " + driverName);
        System.out.println("Violation: " + violationType);
        System.out.println("Fine Amount: " + String.format("%,.0f RWF", fineAmount));
    }

    @Override
    public void recordViolation() {}

    @Override
    public void processPayment() {}
}
