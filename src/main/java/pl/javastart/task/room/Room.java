package pl.javastart.task.room;

public class Room {
    private double roomSize;
    private double roomTemp;
    private double tempLimit;
    private boolean airCon;

    public Room(double roomSize, double roomTemp, double tempLimit, boolean airCon) {
        this.roomSize = roomSize;
        this.roomTemp = roomTemp;
        this.tempLimit = tempLimit;
        this.airCon = airCon;
    }

    double getRoomSize() {
        return roomSize;
    }

    double getRoomTemp() {
        return roomTemp;
    }

    double getTempLimit() {
        return tempLimit;
    }

    boolean isAirCon() {
        return airCon;
    }

    public boolean lowerRoomTemp() {
        if (airCon && roomTemp >= tempLimit + 1) {
            roomTemp--;
            return true;
        } else if (airCon && roomTemp > tempLimit) {
            roomTemp = tempLimit;
            return  true;
        }
        return false;
    }

    public void setTempLimit(double x) {
        tempLimit = x;
    }

    public void showInfo() {
        System.out.println("Wielkość pokoju: " + roomSize
                + ", Aktualna temp w pokoju: " + roomTemp + "*C"
                + ", Temperatura graniczna: " + tempLimit + "*C"
                + ", Wyposażony w klimatyzacje: " + isAirCon());
    }
}

