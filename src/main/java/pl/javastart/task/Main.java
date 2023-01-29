package pl.javastart.task;

import pl.javastart.task.room.Room;

public class Main {

    public static void main(String[] args) {

        Room room1 = new Room(15, 22.7, 20, true);
        Room room2 = new Room(25, 21.5, 20, true);
        Room room3 = new Room(20, 22, 20, false);

        room1.setTempLimit(20.5);

        for (int i = 0; i < 4; i++) {
            room1.showInfo();
            if (room1.lowerRoomTemp()) {
                System.out.println("Temperatura obniżona");
            } else {
                System.out.println("Temperatura nie obniżona");
            }
        }

        System.out.println("--------------------------");

        for (int i = 0; i < 3; i++) {
            room2.showInfo();
            if (room2.lowerRoomTemp()) {
                System.out.println("Temperatura obniżona");
            } else {
                System.out.println("Temperatura nie obniżona");
            }
        }
        System.out.println("--------------------------");

        for (int i = 0; i < 1; i++) {
            room3.showInfo();
            if (room3.lowerRoomTemp()) {
                System.out.println("Temperatura obniżona");
            } else {
                System.out.println("Temperatura nie obniżona");
            }
        }
    }
}
