package hotel_management;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String guestId, guestName, roomType, roomStatus = "AVAILABLE";
        int stayDays;

        // Validate guest ID (digits only)
        while (true) {
            System.out.print("Enter Guest ID (numbers only): ");
            guestId = scanner.nextLine();
            if (guestId.matches("\\d+")) break;
            System.out.println("Invalid ID. Use digits only.");
        }

        // Validate guest name
        while (true) {
            System.out.print("Enter Guest Name: ");
            guestName = scanner.nextLine();
            if (guestName.matches("[A-Za-z ]+")) break;
            System.out.println("Invalid name. Use letters and spaces only.");
        }

        // Validate room type
        while (true) {
            System.out.print("Enter Room Type (STANDARD / DELUXE / SUITE): ");
            roomType = scanner.nextLine().toUpperCase();
            if (roomType.equals("STANDARD") || roomType.equals("DELUXE") || roomType.equals("SUITE")) break;
            System.out.println("Invalid room type.");
        }

        // Validate stay duration
        while (true) {
            System.out.print("Enter Stay Duration (1 to 30 days): ");
            if (scanner.hasNextInt()) {
                stayDays = scanner.nextInt();
                if (stayDays >= 1 && stayDays <= 30) break;
            } else {
                scanner.next(); // consume invalid input
            }
            System.out.println("Invalid number of days.");
        }

        System.out.println("\n=== Booking ===");
        RoomBooking booking = new RoomBooking(guestId, guestName, roomType, stayDays, roomStatus);
        booking.bookRoom();

        System.out.println("\n=== Billing ===");
        Billing bill = new Billing(guestId, guestName, roomType, stayDays, booking.getRoomStatus());
        bill.generateBill();

        System.out.println("\n=== Checkout ===");
        GuestCheckout checkout = new GuestCheckout(guestId, guestName, roomType, stayDays, booking.getRoomStatus());
        checkout.checkoutGuest();

        scanner.close();
    }
}
