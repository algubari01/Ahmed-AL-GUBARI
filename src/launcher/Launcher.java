package launcher;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\n=== Choose a system to run ===");
        System.out.println("1. Construction Site Management (Case Study)");
        System.out.println("2. Hotel Management System");
        System.out.println("3. Traffic Fine System");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();
        System.out.println();

        try {
            switch (choice) {
                case 1:
                    case_study.Main.main(args);
                    break;
                case 2:
                    hotel_management.Main.main(args);
                    break;
                case 3:
                    traffic_fine.Main.main(args);
                    break;
                default:
                    System.out.println("Invalid choice. Exiting...");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
