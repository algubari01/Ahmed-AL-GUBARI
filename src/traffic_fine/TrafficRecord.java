package traffic_fine;

public abstract class TrafficRecord {
    protected String driverId;
    protected String driverName;
    protected String vehiclePlate;
    protected String violationType;
    protected double fineAmount;
    protected String paymentStatus;

    public TrafficRecord(String driverId, String driverName, String vehiclePlate, String violationType) {
        this.driverId = driverId;
        this.driverName = driverName;
        this.vehiclePlate = vehiclePlate.toUpperCase();
        this.violationType = violationType.toUpperCase();
        this.paymentStatus = "UNPAID";
    }

    public abstract void recordViolation();
    public abstract void assessFine();
    public abstract void processPayment();

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public double getFineAmount() {
        return fineAmount;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public void setFineAmount(double fineAmount) {
        this.fineAmount = fineAmount;
    }
}
