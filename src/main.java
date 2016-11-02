import ru.goldtaxi.Entity.*;
import ru.goldtaxi.Utilities.*;

import java.util.ArrayList;
/**
 * Created by ty39p_000 on 31.10.2016.
 */

public class main {
    public static void main(String[] args) {

        ArrayList<Car> CarArrayList = Initialization.initCarArray();
//        for(Car auto : CarArrayList){
//
//            System.out.println(auto.getCarMark());
//        }

        while (true) {
            Order order = OrderReader.orderRead();
            Car CarForOrder = CarSearch.searchFreeCar(CarArrayList, order);
            if(CarForOrder) {
                System.out.println("Мы подобрали для вас машину!");
                System.out.println("Марка автомобиля: "+auto.getCarMark());
                System.out.println("Номер автомобиля: "+auto.getCarNumber());
            }

        }
    }
}
