package pl.lukaszprasek.CompanyApp.domain.services;

import pl.lukaszprasek.CompanyApp.rest.dto.EmployeeDto;

public interface EmployeeService {
    EmployeeDto getEmployeeById(long id);
}
