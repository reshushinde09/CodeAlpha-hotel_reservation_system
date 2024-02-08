package hotel_reservation_system;

public class Room {

	 private int roomNumber;
	    private boolean isReserved;

	    public Room(int roomNumber) {
	        this.roomNumber = roomNumber;
	        this.isReserved = false;
	    }

	    public int getRoomNumber() {
	        return roomNumber; 
	    }

	    public boolean isReserved() {
	        return isReserved;
	    }

	    public void reserveRoom() {
	        isReserved = true;
	    }

	    public void cancelReservation() {
	        isReserved = false;
	    }
	}
