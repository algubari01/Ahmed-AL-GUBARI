package hotel_management;

public abstract class HotelService {
    protected String guestId;
    protected String guestName;
    protected String roomType;
    protected int stayDays;
    protected String roomStatus;

    public HotelService(String guestId, String guestName, String roomType, int stayDays, String roomStatus) {
        this.guestId = guestId;
        this.guestName = guestName;
        this.roomType = roomType.toUpperCase();
        this.stayDays = stayDays;
        this.roomStatus = roomStatus.toUpperCase();
    }

    public abstract void bookRoom();
    public abstract void checkoutGuest();
    public abstract void generateBill();

    // Getters and Setters
    public String getRoomStatus() {
        return roomStatus;
    }

    public void setRoomStatus(String roomStatus) {
        this.roomStatus = roomStatus;
    }

    public int getStayDays() {
        return stayDays;
    }

    public void setStayDays(int stayDays) {
        this.stayDays = stayDays;
    }
}
