package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {

    private List <Car> cars = new ArrayList<>();

    public CarServiceImpl() {
        cars.add(new Car("BMW", "Black", 100000));
        cars.add(new Car("Lada", "Eggplant", 10000));
        cars.add(new Car("Volvo", "Blue", 90000));
        cars.add(new Car("Audi", "Silver", 110000));
        cars.add(new Car("Toyota", "Red", 70000));
    }

    @Override
    public List <Car> limitCars (int count) {
        if (count > 0 && count < 5) {
            return  cars.stream()
                    .limit(count)
                    .collect(Collectors.toList());
        } else {
            return cars;
        }
    }
}
