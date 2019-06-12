package pl.lukaszprasek.CompanyApp.application;

import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

import java.util.List;

public interface CarManager {
    CarDto getCarById(long id);

    List<CarDto> getAllCars();
}
