package nl.inholland.first.API.Service;

import nl.inholland.first.API.Model.F1;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class F1Service {

    private List<F1> cars = new ArrayList<>();

    public F1Service() {
        this.cars = new ArrayList<>(
                List.of(
                        new F1("McLaren-Honda", "superfast", "Elias" , 250),
                        new F1("Alfa Romeo", "superfast", "Mona" , 230),
                        new F1("Ferrari ", "superfast", "carla" , 220)
                )
        );
    }

    public F1 addcar(F1 car) {
        cars.add(car);
        return car;
    }
    public List<F1> getCars() {
        return cars;

    }
}