package hotel_management;

public class GuestCheckout extends HotelService {
    public GuestCheckout(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void checkoutGuest() {
        if (roomStatus.equals("OCCUPIED")) {
            roomStatus = "AVAILABLE";
            System.out.println("Guest " + guestName + " has successfully checked out.");
        } else {
            System.out.println("Error: Room is already available.");
        }
    }

    @Override
    public void bookRoom() {
        // Not handled here
    }

    @Override
    public void generateBill() {
        // Not handled here
    }
}
