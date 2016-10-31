package ru.goldtaxi.Utilities;

import ru.goldtaxi.Entity.Car;
import ru.goldtaxi.Entity.Driver;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by ty39p_000 on 31.10.2016.
 */
public class Initialization {
    public static ArrayList<Car> initCarArray() {

        Random r = new Random(System.currentTimeMillis());

        ArrayList<Car> CarArrayList = new ArrayList<>();

        for (int i = 0 ; i < 4 ; i++){
            Car cars = new Car();
            Driver driver = new Driver();
            driver.setAge(50);
            driver.setID(i);
            driver.setName("Sergey"+i+"Й");
            driver.setSurname("Petrov");
            driver.setTelephone("+7(987)9879988");

            cars.setCarMark("Toyota");
            cars.setCarDriver(driver);
            cars.setCarNumber("т"+r.nextInt(999)+"ак");
            cars.setHaveBabySeat(r.nextBoolean());
            cars.setSmokeCar(r.nextBoolean());
            cars.setCarClass(Car.getTypeOfClassEconomic());
            cars.setCarStatus("Свободен");

            CarArrayList.add(cars);
        }

        return CarArrayList;
    }
}
