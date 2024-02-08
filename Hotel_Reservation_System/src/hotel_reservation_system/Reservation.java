package hotel_reservation_system;

public class Reservation {
	 private String guestName;
	    private Room reservedRoom;

	    public Reservation(String guestName, Room reservedRoom) {
	        this.guestName = guestName;
	        this.reservedRoom = reservedRoom;
	        reservedRoom.reserveRoom();
	    }

	    public String getGuestName() {
	        return guestName;
	    }

	    public Room getReservedRoom() {
	        return reservedRoom;
	    }  

	    public void cancelReservation() {
	        reservedRoom.cancelReservation();
	    }

	    @Override
	    public String toString() {
	        return "Reservation for " + guestName + " - " + reservedRoom;
	    }

}
