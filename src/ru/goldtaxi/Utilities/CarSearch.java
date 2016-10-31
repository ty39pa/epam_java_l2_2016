package ru.goldtaxi.Utilities;

import ru.goldtaxi.Entity.*;

import java.util.ArrayList;

/**
 * Created by ty39p_000 on 31.10.2016.
 */
public class CarSearch{
    public static void searchFreeCar(ArrayList<Car> CarArrayList, Order order) {
        boolean found = false;
        for(Car auto : CarArrayList){
            if(auto.getCarStatus().equals(Car.getTypeOfStatusFree())) {
                if ((order.getNeedCarClass() <= auto.getCarClass())) {
                    if ((order.isNeedSmokeCar() == auto.isSmokeCar()) || !order.isNeedSmokeCar()) {
                        if ((order.isNeedBabySeat() == auto.isHaveBabySeat()) || !order.isNeedBabySeat()) {
                            found = true;
                            auto.setCarStatus(Car.getTypeOfStatusReserved());
                            order.setCarReserver(auto);
                            System.out.println("Мы подобрали для вас машину!");
                            System.out.println("Марка автомобиля: "+auto.getCarMark());
                            System.out.println("Номер автомобиля: "+auto.getCarNumber());
                            break;
                        }
                    }
                }
            }
        }
        if(!found){
            System.out.println("В данный момент нет подходящего для вас автомобиля, заявка ожидает подходящего, освободившегося автомобиля");
        }
    }
}
