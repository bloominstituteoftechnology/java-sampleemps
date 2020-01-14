package com.lamdaschool.sampleemps.controllers;

import com.lamdaschool.sampleemps.models.Employee;
import com.lamdaschool.sampleemps.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employees") // optional
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/employees")
    public ResponseEntity<?> listAllEmployees()
    {
        List<Employee> myEmployees = employeeService.findAllEmployees();
        return new ResponseEntity<>(myEmployees,
                HttpStatus.OK);
    }
}
