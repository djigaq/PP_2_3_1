package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAOImpl implements CarDAO {
    @Override
    public List<Car> allCars(Integer count) {
        List<Car> cars = new ArrayList<>();
        cars.add(new Car(1, "Audi", "white"));
        cars.add(new Car(2, "BMW", "black"));
        cars.add(new Car(3, "Mercedes", "red"));
        cars.add(new Car(4, "Volvo", "brown"));
        cars.add(new Car(5, "Range Rover", "green"));
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}