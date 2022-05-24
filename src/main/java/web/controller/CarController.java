package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.DAO.CarDAO;

import java.util.Optional;

@Controller
public class CarController {
    private CarDAO carDAO;
    @Autowired
    public CarController(CarDAO carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping("/cars")
    public String showCar(@RequestParam(value = "count", required = false) Integer count, Model model) {
       if (count == null) {count=5;}
        model.addAttribute("cars", carDAO.showCars(count));
        return "cars";
    }
}
