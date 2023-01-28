package pl.javastart.task;

import pl.javastart.task.room.Room;
import pl.javastart.task.room.RoomInfo;

public class Main {

    public static void main(String[] args) {
        RoomInfo roomInfo = new RoomInfo();
        Room room1 = new Room(15, 25, 20, true);
        Room room2 = new Room(25, 20.5, 20, true);
        Room room3 = new Room(20, 22, 20, false);

        roomInfo.showRoomInfo(room1);
        room1.lowerRoomTemp();
        roomInfo.showRoomInfo(room1);
        room1.setTempLimit(24);
        roomInfo.showRoomInfo(room1);
        room1.lowerRoomTemp();
        roomInfo.showRoomInfo(room1);

        System.out.println("----------------------------------------");

        roomInfo.showRoomInfo(room2);
        room2.lowerRoomTemp();
        roomInfo.showRoomInfo(room2);

        System.out.println("----------------------------------------");

        roomInfo.showRoomInfo(room3);
        room3.lowerRoomTemp();
        roomInfo.showRoomInfo(room3);

    }
}
