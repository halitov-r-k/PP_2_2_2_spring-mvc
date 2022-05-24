package web.DAO;

import org.springframework.stereotype.Component;
import web.models.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;
    {
        cars = new ArrayList<>();
        cars.add(new Car(1, "NameCar1", "red"));
        cars.add(new Car(2, "NameCar2", "green"));
        cars.add(new Car(3, "NameCar3", "blue"));
        cars.add(new Car(4, "NameCar4", "black"));
        cars.add(new Car(5, "NameCar5", "yellow"));
    }

    public List<Car> showCars(int count) {
         return cars.stream().toList();
    }
}
