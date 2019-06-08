package pl.lukaszprasek.CompanyApp.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.services.CarService;
import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

@Service
public class CarMenagerImpl implements CarMenager {
    private final CarService carService;

    @Autowired
    public CarMenagerImpl(CarService carService) {
        this.carService = carService;
    }

    @Override
    public CarDto getCarById(long id) {
        return carService.getCarById(id);
    }
}
