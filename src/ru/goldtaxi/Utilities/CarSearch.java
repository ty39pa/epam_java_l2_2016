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
            if((auto.getCarStatus().equals(Car.getTypeOfStatusFree())) &&
                    ((order.getNeedCarClass() <= auto.getCarClass())) &&
                    ((order.isNeedSmokeCar() == auto.isSmokeCar()) || !order.isNeedSmokeCar()) &&
                    ((order.isNeedBabySeat() == auto.isHaveBabySeat()) || !order.isNeedBabySeat()))
            {
                found = true;
                auto.setCarStatus(Car.getTypeOfStatusReserved());
                order.setCarReserver(auto);
                return auto;
            }

                }

        }
        if(!found){
            System.out.println("В данный момент нет подходящего для вас автомобиля, заявка ожидает подходящего, освободившегося автомобиля");
        }
    }
}
