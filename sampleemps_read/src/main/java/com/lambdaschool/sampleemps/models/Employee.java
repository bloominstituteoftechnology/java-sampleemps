package com.lambdaschool.sampleemps.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "employees")
public class Employee
{
    @Id // The primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // We will let the database decide how to generate it
    private long employeeid; // long so we can have many rows

    @Column(nullable = false,
            unique = true)
    private String name;

    private double salary;

    @ManyToMany()
    /*
     * Note: JoinTable is the name of a table that will get created in the database combining the two primary keys making up this relationship
     *       joinColumn is the primary key of the main, driving, table
     *       inverseJoinColumns is the primary key of the other table in the relationship
     *
     * We are using a Set inside of a List to help with enforcing uniqueness in the employeetitles. Sets by their very nature
     * only contain unique values. By using Sets we do not have to do a lot of extra coding to enforce uniqueness.
     * We can treat the HashSet very similar to ArrayLists. Differences will be highlighted throughout the course
     */
    @JoinTable(name = "employeetitles",
            joinColumns = @JoinColumn(name = "employeeid"),
            inverseJoinColumns = @JoinColumn(name = "jobtitleid"))
    // we want to ignore, not display, the employees collection found in JobTitle
    @JsonIgnoreProperties(value = "employees")
    Set<JobTitle> jobtitles = new HashSet<>();

    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL,
            // when adding, reading, updating, and delete, the operations should affect the emails table as well)
            orphanRemoval = true)
    // if we find a email that has a reference to an employee that does not exist, delete that email record
    // we want to ignore, not display, the employee object found in Email
    @JsonIgnoreProperties(value = "employee")
    private List<Email> emails = new ArrayList<>();

    public Employee()
    {
        // the default constructor is required by the JPA
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

    public Set<JobTitle> getJobtitles()
    {
        return jobtitles;
    }

    public void setJobtitles(Set<JobTitle> jobtitles)
    {
        this.jobtitles = jobtitles;
    }
}