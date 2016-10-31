package ru.goldtaxi.Entity;

import java.util.Date;

/**
 * Created by ty39p_000 on 30.10.2016.
 */
public class Order {
    private String startPoint;
    private String endPoint;
    private boolean isNeedBabySeat;
    private boolean isNeedSmokeCar;
    private int needCarClass;
    private Car carReserver;

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public boolean isNeedBabySeat() {
        return isNeedBabySeat;
    }

    public void setNeedBabySeat(boolean needBabySeat) {
        isNeedBabySeat = needBabySeat;
    }

    public boolean isNeedSmokeCar() {
        return isNeedSmokeCar;
    }

    public void setNeedSmokeCar(boolean needSmokeCar) {
        isNeedSmokeCar = needSmokeCar;
    }

    public int getNeedCarClass() {
        return needCarClass;
    }

    public void setNeedCarClass(int needCarClass) {
        this.needCarClass = needCarClass;
    }

    public Car getCarReserver() {
        return carReserver;
    }

    public void setCarReserver(Car carReserver) {
        this.carReserver = carReserver;
    }
}
