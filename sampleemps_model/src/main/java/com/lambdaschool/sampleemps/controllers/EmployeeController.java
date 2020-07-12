package com.lambdaschool.sampleemps.controllers;

import com.lambdaschool.sampleemps.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employees") // optional
public class EmployeeController
{
    @Autowired
    private EmployeeService employeeService;

}
