package traffic_fine;

public class FinePayment extends TrafficRecord {
    public FinePayment(String driverId, String driverName, String vehiclePlate, String violationType, double fineAmount, String paymentStatus) {
        super(driverId, driverName, vehiclePlate, violationType);
        this.fineAmount = fineAmount;
        this.paymentStatus = paymentStatus;
    }

    @Override
    public void processPayment() {
        if (paymentStatus.equalsIgnoreCase("UNPAID")) {
            setPaymentStatus("PAID");
            System.out.println("Payment Receipt:");
            System.out.println("Driver: " + driverName);
            System.out.println("Plate: " + vehiclePlate);
            System.out.println("Amount Paid: " + String.format("%,.0f RWF", fineAmount));
            System.out.println("Payment Status: " + paymentStatus);
        } else {
            System.out.println("Fine already paid.");
        }
    }

    @Override
    public void recordViolation() {}

    @Override
    public void assessFine() {}
}
