package com.lambdaschool.sampleemps.repositories;

import com.lambdaschool.sampleemps.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository
    extends CrudRepository<Employee, Long>
{

}
