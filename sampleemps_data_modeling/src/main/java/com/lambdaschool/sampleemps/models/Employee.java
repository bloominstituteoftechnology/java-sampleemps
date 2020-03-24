package com.lambdaschool.sampleemps.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
@JsonIgnoreProperties(value = {"hasvalueforsalary"})
public class Employee extends Auditable
{
    @Id // The primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // We will let the database decide how to generate it
    private long employeeid; // long so we can have many rows

    @Column(nullable = false,
        unique = true)
    private String name;

    /**
     * Used to determine if the field salary has been set or is NULL.
     */
    @Transient
    public boolean hasvalueforsalary = false;

    private double salary;

    /*
     * emp is the field from EmployeeTitles
     * CascadeType.ALL says that when we add, update, delete an Employee record, have that affect emp in EmployeeTitle.
     * Notice that in EmployeeTitle there is no cascade option. This way manipulating an Employee record only affects
     * the EmployeeTitle join table but does not affect the JobTitle table.
     */
    @OneToMany(mappedBy = "emp",
        cascade = CascadeType.ALL)
    /*
     * When displaying EmployeeTitles from the Employee class, do not display the employee again.
     * However do allow for data to be added to the emp field in EmployeeTitles
     */
    @JsonIgnoreProperties(value = "emp",
        allowSetters = true)
    /*
     * We know all of this works with EmployeeTitles because that is the class of the field name that making the One To Many relationship!
     * This array contains the list of EmployeeTitles assigned to this Employee
     */
    private List<EmployeeTitles> jobnames = new ArrayList<>();

    /*
     * This starts the One To Many relation of employee to emails
     */
    @OneToMany(mappedBy = "employee",
        cascade = CascadeType.ALL,
        // when adding, reading, updating, and delete, the operations should affect the emails table as well)
        orphanRemoval = true)
    // if we find a email that has a reference to an employee that does not exist, delete that email record
    @JsonIgnoreProperties(value = "employee",
        allowSetters = true)
    private List<Email> emails = new ArrayList<>();

    public Employee()
    {
        // the default constructor is required by the JPA
    }

    public Employee(
        String name,
        double salary,
        List<EmployeeTitles> jobnames)
    {
        this.name = name;
        this.salary = salary;

        /*
         * Force the list of roles to be associated with this new employee object!
         */
        for (EmployeeTitles et : jobnames)
        {
            et.setEmp(this);
        }
        this.jobnames = jobnames;
    }

    public long getEmployeeid()
    {
        return employeeid;
    }

    public void setEmployeeid(long employeeid)
    {
        this.employeeid = employeeid;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getSalary()
    {
        return salary;
    }

    public void setSalary(double salary)
    {
        hasvalueforsalary = true;
        this.salary = salary;
    }

    public List<Email> getEmails()
    {
        return emails;
    }

    public void setEmails(List<Email> emails)
    {
        this.emails = emails;
    }

    /*
     * We need a getter for the new One To Many relations
     */
    public List<EmployeeTitles> getJobnames()
    {
        return jobnames;
    }

    /*
     * We need a setter for the new One To Many relations
     */
    public void setJobnames(List<EmployeeTitles> jobnames)
    {
        this.jobnames = jobnames;
    }

    /*
     * Due to the new One To Many relation, we need a new way to add a Job Title to the employee
     */
    public void addJobTitle(
        JobTitle jobTitle,
        String manager)
    {
        jobnames.add(new EmployeeTitles(this,
            jobTitle,
            manager));
    }
}