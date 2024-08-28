package br.edu.fema.auth.service;

import br.edu.fema.auth.domain.car.Car;
import br.edu.fema.auth.repository.CarRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    private final CarRepository carRepository;

    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> findAllCars(){
        return carRepository.findAll();
    }

    public void saveCar(Car car){
        carRepository.save(car);
    }
}
