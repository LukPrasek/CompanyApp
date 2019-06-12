package pl.lukaszprasek.CompanyApp.rest.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lukaszprasek.CompanyApp.application.CarManager;
import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

import java.util.List;

@RestController
@RequestMapping("/rest/v1/")
@Api("Show all api")
public class CarController {
    private final CarManager carManager;

    @Autowired
    public CarController(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping(value = "car/{id}")
    @ApiOperation("Get car by Id")
    public CarDto getCarById(@PathVariable("id") long id) {
        return carManager.getCarById(id);
    }
    @GetMapping(value = "allcars")
    @ApiOperation("Get all cars")
    public List<CarDto> getAllCars() {
        return carManager.getAllCars();
    }
}
