package com.lamdaschool.sampleemps.repositories;

import com.lamdaschool.sampleemps.models.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface EmployeeRepository
    extends CrudRepository<Employee, Long>
{
    List<Employee> findByNameContainingIgnoreCase(String subname);

    List<Employee> findByEmails_EmailContainingIgnoreCase(String subemail);

//    @Query(value = "SELECT e.name as employee_name, count(et.employeeid) as count_job_titles FROM employees e LEFT JOIN employeetitles et ON e.employeeid = et.employeeid GROUP BY e.name",
//        nativeQuery = true)
//    List<EmpNameCountJobs> getCountEmpJobs();
}
