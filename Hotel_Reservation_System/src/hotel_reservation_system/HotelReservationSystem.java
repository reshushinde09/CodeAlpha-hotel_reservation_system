package hotel_reservation_system;

import java.util.ArrayList;
import java.util.Scanner;

public class HotelReservationSystem {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        Hotel hotel = new Hotel();
	        ArrayList<Reservation> reservations = new ArrayList<>();

	        while (true) {
	            System.out.println("\n1. View Available Rooms");
	            System.out.println("2. Make a Reservation");
	            System.out.println("3. View Reservations");
	            System.out.println("4. Cancel Reservation");
	            System.out.println("5. Exit");
	            System.out.print("Enter your choice: ");

	            int choice = scanner.nextInt();

	            switch (choice) {
	                case 1:
	                    ArrayList<Room> availableRooms = hotel.getAvailableRooms();
	                    System.out.println("Available Rooms:");
	                    for (Room room : availableRooms) {
	                        System.out.println("Room " + room.getRoomNumber());
	                    }
	                    System.out.println();
	                    break;

	                case 2:
	                    System.out.print("Enter your name: ");
	                    String guestName = scanner.next();
	                    System.out.print("Enter room number to reserve: ");
	                    int roomNumberToReserve = scanner.nextInt();

	                    Room selectedRoom = hotel.getRoomByNumber(roomNumberToReserve);

	                    if (selectedRoom != null && !selectedRoom.isReserved()) {
	                        Reservation reservation = new Reservation(guestName, selectedRoom);
	                        reservations.add(reservation);
	                        System.out.println("Reservation successful!\n" + reservation);
	                    } else {
	                        System.out.println("Invalid room number or room already reserved. Please try again.");
	                    }
	                    
	                    break;

	                case 3:
	                    System.out.println("Reservations:");
	                    for (Reservation reservation : reservations) {
	                        System.out.println("Guest: " + reservation.getGuestName() +
	                                ", Room: " + reservation.getReservedRoom().getRoomNumber());
	                    }
	                    break;

	                case 4:
	                    System.out.print("Enter your name to cancel reservation: ");
	                    String guestNameToCancel = scanner.next();

	                    Reservation reservationToCancel = null;
	                    for (Reservation reservation : reservations) {
	                        if (reservation.getGuestName().equals(guestNameToCancel)) {
	                            reservationToCancel = reservation;
	                            break;
	                        }
	                    }

	                    if (reservationToCancel != null) {
	                        reservationToCancel.cancelReservation();
	                        reservations.remove(reservationToCancel);
	                        System.out.println("Reservation canceled successfully!");
	                    } else {
	                        System.out.println("Reservation not found. Please enter a valid name.");
	                    }
	                    break;

	                case 5:
	                    System.out.println("Exiting program. Goodbye!");
	                    System.exit(0);

	                default:
	                    System.out.println("Invalid choice. Please enter a valid option.");
	            }
	        }
	    }
}
