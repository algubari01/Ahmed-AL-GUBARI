package hotel_management;

public class Billing extends HotelService {
    public Billing(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        super(guestId, guestName, roomType, stayDays, roomStatus);
    }

    @Override
    public void generateBill() {
        int rate = 0;
        switch (roomType) {
            case "STANDARD":
                rate = 50000;
                break;
            case "DELUXE":
                rate = 80000;
                break;
            case "SUITE":
                rate = 120000;
                break;
            default:
                System.out.println("Invalid room type.");
                return;
        }

        int total = stayDays * rate;
        System.out.println("======= Bill Summary =======");
        System.out.println("Guest ID     : " + guestId);
        System.out.println("Guest Name   : " + guestName);
        System.out.println("Room Type    : " + roomType);
        System.out.println("Stay Duration: " + stayDays + " night(s)");
        System.out.println("Total Cost   : " + String.format("%,d RWF", total));
    }

    @Override
    public void bookRoom() {}
    @Override
    public void checkoutGuest() {}
}

