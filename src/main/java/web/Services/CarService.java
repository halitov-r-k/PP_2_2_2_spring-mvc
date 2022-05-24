package web.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.DAO.CarDAO;
import web.models.Car;

import java.util.List;

@Service
public class CarService {
    @Autowired
    private CarDAO carDAO;

    public List<Car> getCars(int count) {
        return carDAO.showCars(count);
    }
}
