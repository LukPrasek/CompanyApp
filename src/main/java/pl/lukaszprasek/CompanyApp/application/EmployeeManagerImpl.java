package pl.lukaszprasek.CompanyApp.application;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.lukaszprasek.CompanyApp.domain.services.EmployeeService;
import pl.lukaszprasek.CompanyApp.rest.dto.EmployeeDto;

@Service
public class EmployeeManagerImpl implements EmployeeManager {
    private final EmployeeService employeeService;

    @Autowired
    public EmployeeManagerImpl(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @Override
    public EmployeeDto getEmployeeById(long id) {
        return employeeService.getEmployeeById(id);
    }
}
