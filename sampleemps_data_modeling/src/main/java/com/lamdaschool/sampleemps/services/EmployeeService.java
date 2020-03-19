package com.lamdaschool.sampleemps.services;

import com.lamdaschool.sampleemps.models.Employee;

import java.util.List;

public interface EmployeeService
{
    List<Employee> findAllEmployees();

    List<Employee> findEmployeeNameContaining(String subname);

    List<Employee> findEmployeeEmailContaining(String subemail);

    Employee save(Employee employee);

    Employee update(
        Employee employee,
        long employeeid);

    void delete(long employeeid);
}
