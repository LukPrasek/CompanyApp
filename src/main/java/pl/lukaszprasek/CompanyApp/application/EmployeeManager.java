package pl.lukaszprasek.CompanyApp.application;

import pl.lukaszprasek.CompanyApp.rest.dto.EmployeeDto;

public interface EmployeeManager {
    EmployeeDto getEmployeeById(long id);
}
