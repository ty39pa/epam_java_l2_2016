package ru.goldtaxi.Entity;

/**
 * Created by ty39p_000 on 29.10.2016.
 */
public class Car {
    private String carMark;
    private Driver carDriver;
    private String carNumber;
    private boolean isHaveBabySeat;
    private boolean isSmokeCar;
    private int carClass;
    private String carStatus;
    private static final int TYPE_OF_CLASS_ECONOMIC = 0;
    private static final int TYPE_OF_CLASS_BUSYNESS = 1;
    private static final String TYPE_OF_STATUS_FREE = "Свободен";
    private static final String TYPE_OF_STATUS_RESERVED = "Занят";

    public static int getTypeOfClassEconomic() {
        return TYPE_OF_CLASS_ECONOMIC;
    }

    public static int getTypeOfClassBusyness() {
        return TYPE_OF_CLASS_BUSYNESS;
    }

    public static String getTypeOfStatusFree() {
        return TYPE_OF_STATUS_FREE;
    }

    public static String getTypeOfStatusReserved() {
        return TYPE_OF_STATUS_RESERVED;
    }

    public String getCarMark() {
        return carMark;
    }

    public void setCarMark(String carMark) {
        this.carMark = carMark;
    }

    public Driver getCarDriver() {
        return carDriver;
    }

    public void setCarDriver(Driver carDriver) {
        this.carDriver = carDriver;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public boolean isHaveBabySeat() {
        return isHaveBabySeat;
    }

    public void setHaveBabySeat(boolean haveBabySeat) {
        isHaveBabySeat = haveBabySeat;
    }

    public boolean isSmokeCar() {
        return isSmokeCar;
    }

    public void setSmokeCar(boolean smokeCar) {
        isSmokeCar = smokeCar;
    }

    public int getCarClass() {
        return carClass;
    }

    public void setCarClass(int carClass) {
        this.carClass = carClass;
    }

    public String getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(String carStatus) {
        this.carStatus = carStatus;
    }

}
