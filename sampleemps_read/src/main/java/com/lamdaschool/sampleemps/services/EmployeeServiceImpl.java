package com.lamdaschool.sampleemps.services;

import com.lamdaschool.sampleemps.models.Employee;
import com.lamdaschool.sampleemps.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service(value = "employeeSerivce") // needed to name this implementation as the service to use
public class EmployeeServiceImpl implements EmployeeService // notice the Impl for implementing a service
{
    @Autowired
    private EmployeeRepository employeerepos;

    @Override
    public List<Employee> findAllEmployees()
    {
        List<Employee> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        employeerepos.findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
