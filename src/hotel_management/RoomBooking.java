package hotel_management;

public class RoomBooking extends HotelService {
    public RoomBooking(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void bookRoom() {
        if (stayDays >= 1 && stayDays <= 30 && roomStatus.equals("AVAILABLE")) {
            roomStatus = "OCCUPIED";
            System.out.println("Booking confirmed for " + guestName + ". Room status: " + roomStatus);
        } else {
            System.out.println("Booking failed. Either invalid stay duration or room not available.");
        }
    }

    @Override
    public void checkoutGuest() {
        // Not handled here
    }

    @Override
    public void generateBill() {
        // Not handled here
    }
}
