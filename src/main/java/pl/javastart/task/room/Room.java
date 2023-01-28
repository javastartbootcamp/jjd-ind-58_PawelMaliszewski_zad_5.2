package pl.javastart.task.room;

public class Room {
    private double roomSize;
    private double roomTemp;
    private double tempLimit;
    private boolean airCon;
    private boolean isTempLowered;

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

    boolean isTempLowered() {
        return isTempLowered;
    }

    public void lowerRoomTemp() {
        if (airCon && roomTemp >= tempLimit + 1) {
            roomTemp--;
            isTempLowered = true;
        } else if (airCon && roomTemp > tempLimit && roomTemp < tempLimit + 1) {
            roomTemp = roomTemp - (roomTemp - tempLimit);
            isTempLowered = true;
        } else if (airCon == false || roomTemp == tempLimit) {
            isTempLowered = false;
        }
    }

    public void setTempLimit(double x) {
        tempLimit = x;
        isTempLowered = false;
    }
}

