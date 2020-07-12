package com.lambdaschool.sampleemps.services;

import com.lambdaschool.sampleemps.models.Employee;
import com.lambdaschool.sampleemps.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(value = "employeeSerivce") // needed to name this implementation as the service to use
public class EmployeeServiceImpl
    implements EmployeeService // notice the Impl for implementing a service
{
    @Autowired
    private EmployeeRepository employeerepos;

    @Transactional
    @Override
    public Employee save(Employee employee)
    {
        return employeerepos.save(employee);
    }
}
