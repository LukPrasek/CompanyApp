package pl.lukaszprasek.CompanyApp.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.services.CarService;
import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

import java.util.List;

@Service
public class CarManagerImpl implements CarManager {
    private final CarService carService;

    @Autowired
    public CarManagerImpl(CarService carService) {
        this.carService = carService;
    }

    @Override
    public CarDto getCarById(long id) {
        return carService.getCarById(id);
    }

    @Override
    public List<CarDto> getAllCars() {
        return carService.getAllCars();
    }
}
