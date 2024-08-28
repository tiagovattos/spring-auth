package br.edu.fema.auth.controller;

import br.edu.fema.auth.domain.car.Car;
import br.edu.fema.auth.service.CarService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/car")
public class CarController {
    private final CarService carService;

    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public ResponseEntity<List<Car>> findAllCars(){
        return ResponseEntity.ok(carService.findAllCars());
    }

    @PostMapping
    public ResponseEntity<Void> saveCar(@RequestBody Car car){
        carService.saveCar(car);
        return ResponseEntity.ok().build();
    }
}
