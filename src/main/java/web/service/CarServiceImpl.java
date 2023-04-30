package web.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import web.model.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarServiceImpl implements CarService {
    private static List<Car> listCars;
    {
        listCars = new ArrayList<>();
        listCars.add(new Car("Lexus GX", 570, 250));
        listCars.add(new Car("Toyota LC", 300, 230));
        listCars.add(new Car("Toyota Celica", 2023, 300));
        listCars.add(new Car("Toyota Corolla", 2000, 180));
        listCars.add(new Car("Toyota Crown", 200, 210));
    }

    @Override
    public List<Car> lisrCars() {
        return listCars;
    }

    @Override
    public List<Car> getCars(int count) {
        return listCars.stream().limit(count).collect(Collectors.toList());
    }
}