package hotel_reservation_system;

import java.util.ArrayList;

public class Hotel {


	private ArrayList<Room> rooms;

    public Hotel() {
        rooms = new ArrayList<>();
        for (int i = 1; i <= i; i++) {
            rooms.add(new Room(i));
        }
    }

    public ArrayList<Room> getAvailableRooms() {
        ArrayList<Room> availableRooms = new ArrayList<>();
        for (Room room : rooms) {
            if (!room.isReserved()) {
                availableRooms.add(room);
            }
        }
        return availableRooms;
    }

    public Room getRoomByNumber(int roomNumber) {
        for (Room room : rooms) {
            if (room.getRoomNumber() == roomNumber) {
                return room;
            }
        }
        return null;
    }
}


