package pl.javastart.task.room;

public class RoomInfo {

    public void showRoomInfo(Room room) {
        System.out.println("Wielkość pokoju: " + room.getRoomSize()
                + ", Aktualna temp w pokoju: " + room.getRoomTemp() + "*C"
                + ", Temperatura graniczna: " + room.getTempLimit() + "*C"
                + ", Wyposażony w klimatyzacje: " + room.isAirCon());

    }
}
