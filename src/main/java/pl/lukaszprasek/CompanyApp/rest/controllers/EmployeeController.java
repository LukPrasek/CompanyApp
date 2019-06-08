package pl.lukaszprasek.CompanyApp.rest.controllers;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.lukaszprasek.CompanyApp.application.EmployeeManager;
import pl.lukaszprasek.CompanyApp.rest.dto.EmployeeDto;

@RestController
@RequestMapping("rest/v1/")
@Api("Show all api")
public class EmployeeController {

    private final EmployeeManager employeeManager;

    @Autowired
    public EmployeeController(EmployeeManager employeeManager) {
        this.employeeManager = employeeManager;
    }

    @GetMapping(value = "employee/{id}", produces = "application/json")
    @ApiOperation("Get employee by Id")
    public EmployeeDto getEmployeeById(@PathVariable("id") long id) {
        return employeeManager.getEmployeeById(id);
    }
}
