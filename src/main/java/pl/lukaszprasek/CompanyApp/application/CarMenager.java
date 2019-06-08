package pl.lukaszprasek.CompanyApp.application;

import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

public interface CarMenager {
    CarDto getCarById(long id);
}
