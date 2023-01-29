package pl.javastart.task;

import pl.javastart.task.room.Room;
import pl.javastart.task.room.RoomInfo;

public class Main {

    public static void main(String[] args) {
        RoomInfo roomInfo = new RoomInfo();
        Room room1 = new Room(15, 23.7, 20, true);
        Room room2 = new Room(25, 21.5, 20, true);
        Room room3 = new Room(20, 22, 20, false);

        room1.setTempLimit(20.5);

        for (int i = 0; i < 4; i++) {
            roomInfo.showRoomInfo(room1);
            if (room1.lowerRoomTemp()) {
                System.out.println("Temperatura obniżona");
            } else {
                System.out.println("Temperatura nie obniżona");
            }
        }

        System.out.println("--------------------------");

        for (int i = 0; i < 2; i++) {
            roomInfo.showRoomInfo(room2);
            if (room2.lowerRoomTemp()) {
                System.out.println("Temperatura obniżona");
            } else {
                System.out.println("Temperatura nie obniżona");
            }
        }
        System.out.println("--------------------------");

        for (int i = 0; i < 1; i++) {
            roomInfo.showRoomInfo(room3);
            if (room3.lowerRoomTemp()) {
                System.out.println("Temperatura obniżona");
            } else {
                System.out.println("Temperatura nie obniżona");
            }
        }
    }
}
