package pl.lukaszprasek.CompanyApp.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.entities.CarEntity;
import pl.lukaszprasek.CompanyApp.domain.repositories.CarRepository;
import pl.lukaszprasek.CompanyApp.rest.dto.CarDto;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarServiceImpl(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    @Override
    public CarDto getCarById(long id) {
        CarEntity carEntity = carRepository.getOne(id);
        return mapSingleCarEntityToCarDto(carEntity);
    }

    @Override
    public List<CarDto> getAllCars() {
        return carRepository.findAll().stream()
                .map(carEntity -> mapSingleCarEntityToCarDto(carEntity))
                .collect(Collectors.toList());}

    private CarDto mapSingleCarEntityToCarDto(CarEntity carEntity) {
        return new CarDto.Builder().withCarId(carEntity.getCarId())
                .withBrand(carEntity.getBrand())
                .withModel(carEntity.getModel())
                .withSeatsNumber(carEntity.getSeatsNumber())
                .withEmpId(carEntity.getEmployeeEntity() != null ? carEntity.getEmployeeEntity().getEmployeeId() : 0).build();
    }
}
