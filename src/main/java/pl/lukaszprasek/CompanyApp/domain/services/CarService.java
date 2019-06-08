package pl.lukaszprasek.CompanyApp.domain.services;

import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

public interface CarService {
    CarDto getCarById(long id);
}
