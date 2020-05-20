package com.lambdaschool.sampleemps.repositories;

import com.lambdaschool.sampleemps.models.Employee;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository
    extends CrudRepository<Employee, Long>
{
    List<Employee> findByNameContainingIgnoreCase(String subname);

    List<Employee> findByEmails_EmailContainingIgnoreCase(String subemail);
}
