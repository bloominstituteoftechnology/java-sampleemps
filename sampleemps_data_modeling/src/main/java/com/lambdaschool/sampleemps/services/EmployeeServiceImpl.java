package com.lambdaschool.sampleemps.services;

import com.lambdaschool.sampleemps.models.Email;
import com.lambdaschool.sampleemps.models.Employee;
import com.lambdaschool.sampleemps.models.EmployeeTitles;
import com.lambdaschool.sampleemps.models.JobTitle;
import com.lambdaschool.sampleemps.repositories.EmployeeRepository;
import com.lambdaschool.sampleemps.repositories.JobTitleRepository;
import com.lambdaschool.sampleemps.views.EmpNameCountJobs;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;
import java.util.ArrayList;
import java.util.List;

@Transactional
@Service(value = "employeeSerivce") // needed to name this implementation as the service to use
public class EmployeeServiceImpl
    implements EmployeeService // notice the Impl for implementing a service
{
    @Autowired
    private EmployeeRepository employeerepos;

    @Autowired
    private JobTitleRepository jtrepos;


    @Override
    public List<Employee> findAllEmployees()
    {
        List<Employee> list = new ArrayList<>();
        /*
         * findAll returns an iterator set.
         * iterate over the iterator set and add each element to an array list.
         */
        employeerepos.findAll()
            .iterator()
            .forEachRemaining(list::add);
        return list;
    }

    @Override
    public List<Employee> findEmployeeNameContaining(String subname)
    {
        return employeerepos.findByNameContainingIgnoreCase(subname);
    }

    @Override
    public List<Employee> findEmployeeEmailContaining(String subemail)
    {
        return employeerepos.findByEmails_EmailContainingIgnoreCase(subemail);
    }

    @Transactional
    @Override
    public Employee save(Employee employee)
    {
        Employee newEmployee = new Employee();

        if (employee.getEmployeeid() != 0)
        {
            Employee oldEmp = employeerepos.findById(employee.getEmployeeid())
                .orElseThrow(() -> new EntityNotFoundException("Employee " + employee.getEmployeeid() + " Not Found"));

            // delete the job titles for the old employee we are replacing
            for (EmployeeTitles et : oldEmp.getJobnames())
            {
                System.out.println("~~~~~~~~~~ Will be a Custom Query ~~~~~~~~~~");
            }
            newEmployee.setEmployeeid(employee.getEmployeeid());
        }
        newEmployee.setName(employee.getName());
        newEmployee.setSalary(employee.getSalary());

        newEmployee.getJobnames()
            .clear();
        if (employee.getEmployeeid() == 0)
        {
            for (EmployeeTitles et : employee.getJobnames())
            {
                JobTitle newET = jtrepos.findById(et.getJobname()
                    .getJobtitleid())
                    .orElseThrow(() -> new EntityNotFoundException("JobTitle " + et.getJobname()
                        .getJobtitleid() + " Not Found"));

                newEmployee.addJobTitle(newET,
                    et.getManager());
            }
        } else
        {
            // add the new job titles for the employee we are replacing!
            for (EmployeeTitles et : employee.getJobnames())
            {
                System.out.println("~~~~~~~~~~ Will be a Custom Query ~~~~~~~~~~");
            }
        }

        newEmployee.getEmails()
            .clear();
        for (Email e : employee.getEmails())
        {
            Email newEmail = new Email();
            newEmail.setEmail(e.getEmail());
            newEmail.setEmployee(newEmployee);

            newEmployee.getEmails()
                .add(newEmail);
        }

        return employeerepos.save(newEmployee);
    }

    @Transactional
    @Override
    public Employee update(
        Employee employee,
        long employeeid)
    {
        Employee currentEmployee = employeerepos.findById(employeeid)
            .orElseThrow(() -> new EntityNotFoundException("Employee " + employeeid + " Not Found"));

        if (employee.getName() != null)
        {
            currentEmployee.setName(employee.getName());
        }

        if (employee.hasvalueforsalary)
        {
            currentEmployee.setSalary(employee.getSalary());
        }

        if (employee.getJobnames()
            .size() > 0)
        {
            // delete the roles for the old employee we are replacing
            for (EmployeeTitles et : currentEmployee.getJobnames())
            {
                System.out.println("~~~~~~~~~~ Will be a Custom Query ~~~~~~~~~~");
            }

            // add the roles for the new employee we are replacing with
            for (EmployeeTitles et : employee.getJobnames())
            {
                System.out.println("~~~~~~~~~~ Will be a Custom Query ~~~~~~~~~~");
            }
        }

        if (employee.getEmails()
            .size() > 0)
        {
            currentEmployee.getEmails()
                .clear();
            for (Email e : employee.getEmails())
            {
                Email newEmail = new Email();
                newEmail.setEmail(e.getEmail());
                newEmail.setEmployee(currentEmployee);

                currentEmployee.getEmails()
                    .add(newEmail);
            }
        }

        return employeerepos.save(currentEmployee);
    }

    @Transactional
    @Override
    public void delete(long employeeid)
    {
        if (employeerepos.findById(employeeid)
            .isPresent())
        {
            employeerepos.deleteById(employeeid);
        } else
        {
            throw new EntityNotFoundException("Employee " + employeeid + " Not Found");
        }
    }

    @Override
    public List<EmpNameCountJobs> getEmpNameCountJobs()
    {
        return employeerepos.getCountEmpJobs();
    }

    @Transactional
    @Override
    public void deleteEmpJobTitle(
        long employeeid,
        long jobtitleid)
    {
        employeerepos.findById(employeeid)
            .orElseThrow(() -> new EntityNotFoundException("Employee id " + employeeid + " not found!"));

        jtrepos.findById(jobtitleid)
            .orElseThrow(() -> new EntityNotFoundException("Job Title id " + jobtitleid + " not found!"));

        if (employeerepos.checkEmpJobTitleCombo(employeeid,
            jobtitleid)
            .getCount() > 0)
        {
            employeerepos.deleteEmployeeJobTitleCombo(employeeid,
                jobtitleid);
        } else
        {
            throw new EntityNotFoundException("Employee and Job Title Combination Does Not Exists");
        }
    }

    @Transactional
    @Override
    public void addEmpJobTitle(
        long employeeid,
        long jobtitleid,
        String manager)
    {
        employeerepos.findById(employeeid)
            .orElseThrow(() -> new EntityNotFoundException("Employee id " + employeeid + " not found!"));

        jtrepos.findById(jobtitleid)
            .orElseThrow(() -> new EntityNotFoundException("Job Title id " + jobtitleid + " not found!"));

        if (employeerepos.checkEmpJobTitleCombo(employeeid,
            jobtitleid)
            .getCount() <= 0)
        {
            employeerepos.insertEmployeeJobTitleCombo("SYSTEM",
                employeeid,
                jobtitleid,
                manager);
        } else
        {
            throw new EntityExistsException("Employee and Job Title Combination Exists");
        }
    }
}
