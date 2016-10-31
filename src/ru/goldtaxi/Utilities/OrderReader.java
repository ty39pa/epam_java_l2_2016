package ru.goldtaxi.Utilities;
import java.util.Scanner;

import ru.goldtaxi.Entity.Order;
/**
 * Created by ty39p_000 on 31.10.2016.
 */
public class OrderReader {

    private static Scanner reader = null;

    public static Order orderRead() {
        Order order = new Order();

        Scanner in = new Scanner(System.in);
        System.out.println("Введите данные о заказе: ");
        String info = in.nextLine();

        String[] parts = info.split("\\|", -1);


        order.setStartPoint(parts[0]);
        order.setEndPoint(parts[1]);
        if(parts[2].equals("1")) {
            order.setNeedBabySeat(true);
        }
        else{
            order.setNeedBabySeat(false);
        }
        if(parts[3].equals("1")) {
            order.setNeedSmokeCar(true);
        }
        else{
            order.setNeedSmokeCar(false);
        }

        order.setNeedCarClass(Integer.parseInt(parts[4]));


//        for(String part : parts) System.out.println(part);

        return order;
    }
}
