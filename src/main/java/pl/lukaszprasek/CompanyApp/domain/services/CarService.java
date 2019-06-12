package pl.lukaszprasek.CompanyApp.domain.services;

import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

import java.util.List;

public interface CarService {
    CarDto getCarById(long id);
    List<CarDto> getAllCars();
}
