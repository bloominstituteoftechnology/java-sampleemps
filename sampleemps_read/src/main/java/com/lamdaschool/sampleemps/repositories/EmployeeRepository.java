package com.lamdaschool.sampleemps.repositories;

import com.lamdaschool.sampleemps.models.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long>
{
}
