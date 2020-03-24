package com.lambdaschool.sampleemps.controllers;

import com.lambdaschool.sampleemps.models.Employee;
import com.lambdaschool.sampleemps.services.EmployeeService;
import com.lambdaschool.sampleemps.views.EmpNameCountJobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import javax.validation.Valid;
import java.net.URI;
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

    @GetMapping(value = "/employeename/{subname}")
    public ResponseEntity<?> listEmployeesWithName(
        @PathVariable
            String subname)
    {
        List<Employee> myEmployees = employeeService.findEmployeeNameContaining(subname);
        return new ResponseEntity<>(myEmployees,
            HttpStatus.OK);
    }

    @GetMapping(value = "/employeeemail/{subemail}")
    public ResponseEntity<?> listEmployeesWithEmail(
        @PathVariable
            String subemail)
    {
        List<Employee> myEmployees = employeeService.findEmployeeEmailContaining(subemail);
        return new ResponseEntity<>(myEmployees,
            HttpStatus.OK);
    }

    @PostMapping(value = "/employee",
        consumes = {"application/json"})
    public ResponseEntity<?> addNewEmployee(
        @Valid
        @RequestBody
            Employee newEmployee)
    {
        // ids are not recognized by the Post method
        newEmployee.setEmployeeid(0);
        newEmployee = employeeService.save(newEmployee);

        // set the location header for the newly created resource
        HttpHeaders responseHeaders = new HttpHeaders();
        URI newEmployeeURI = ServletUriComponentsBuilder.fromCurrentRequest()
            .path("/{employeeid}")
            .buildAndExpand(newEmployee.getEmployeeid())
            .toUri();
        responseHeaders.setLocation(newEmployeeURI);

        return new ResponseEntity<>(null,
            responseHeaders,
            HttpStatus.CREATED);
    }

    @PutMapping(value = "/employee/{employeeid}",
        consumes = {"application/json"})
    public ResponseEntity<?> updateFullEmployee(
        @Valid
        @RequestBody
            Employee updateEmployee,
        @PathVariable
            long employeeid)
    {
        updateEmployee.setEmployeeid(employeeid);
        employeeService.save(updateEmployee);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PatchMapping(value = "/employee/{employeeid}",
        consumes = {"application/json"})
    public ResponseEntity<?> updateEmployee(
        @RequestBody
            Employee updateEmployee,
        @PathVariable
            long employeeid)
    {
        employeeService.update(updateEmployee,
            employeeid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping(value = "/employee/{employeeid}")
    public ResponseEntity<?> deleteEmployeeById(
        @PathVariable
            long employeeid)
    {
        employeeService.delete(employeeid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping(value = "/job/counts")
    public ResponseEntity<?> getEmpJobCounts()
    {
        List<EmpNameCountJobs> myEmployees = employeeService.getEmpNameCountJobs();
        return new ResponseEntity<>(myEmployees,
            HttpStatus.OK);
    }

    @DeleteMapping(value = "/employee/{employeeid}/jobtitle/{jobtitleid}")
    public ResponseEntity<?> deleteEmployeeJobTitlesByid(
        @PathVariable
            long employeeid,
        @PathVariable
            long jobtitleid)
    {
        employeeService.deleteEmpJobTitle(employeeid,
        jobtitleid);

        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PostMapping(value = "/employee/{employeeid}/jobtitle/{jobtitleid}/manager/{manager}")
    public ResponseEntity<?> addEmployeeJobTitlesByid(
        @PathVariable
            long employeeid,
        @PathVariable
            long jobtitleid,
        @PathVariable
            String manager)
    {
        employeeService.addEmpJobTitle(employeeid,
            jobtitleid, manager);

        return new ResponseEntity<>(HttpStatus.OK);
    }
}
