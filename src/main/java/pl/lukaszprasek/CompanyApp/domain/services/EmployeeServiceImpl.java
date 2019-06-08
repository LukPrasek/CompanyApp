package pl.lukaszprasek.CompanyApp.domain.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.entities.EmployeeEntity;
import pl.lukaszprasek.CompanyApp.domain.repositories.EmployeeRepository;
import pl.lukaszprasek.CompanyApp.rest.dto.EmployeeDto;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public EmployeeDto getEmployeeById(long id) {
        EmployeeEntity employerEntity = employeeRepository.getOne(id);
        return new EmployeeDto.Builder().withId(employerEntity.getEmployeeId())
                .withName(employerEntity.getName())
                .withSurname(employerEntity.getSurname())
                .withBirthday(employerEntity.getBirthday())
                .withStartWorkingDate(employerEntity.getStartWorkingDate())
                .withEmployeePosition(employerEntity.getEmployeePosition())
                .withSiteId(employerEntity.getSiteEntity().getSiteId()).build();
    }
}
