package com.lamdaschool.sampleemps.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee
{

    @Id // The primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // We will let the database decide how to generate it
    private long employeeid; // long so we can have many rows

    private String name;

    @OneToMany(mappedBy = "employee",
            cascade = CascadeType.ALL, // when adding, reading, updating, and delete, the operations should affect the emails table as well)
            orphanRemoval = true) // if we find a email that has a reference to an employee that does not exist, delete that email record
    @JsonIgnoreProperties("employee")
    private List<Email> emails = new ArrayList<>();

    @ManyToMany()
    /*
     * Note: JoinTable is the name of a table that will get created in the database combining the two primary keys making up this relationship
     *       joinColumn is the primary key of the main, driving, table
     *       inverseJoinColumns is the primary key of the other table in the relationship
     */
    @JoinTable(name = "employeetitles",
            joinColumns = @JoinColumn(name = "employeeid"),
            inverseJoinColumns = @JoinColumn(name = "jobtitleid"))
    @JsonIgnoreProperties("employees")
    List<JobTitle> jobtitles = new ArrayList<>();

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

    public List<Email> getEmails()
    {
        return emails;
    }

    public void setEmails(List<Email> emails)
    {
        this.emails = emails;
    }

    public List<JobTitle> getJobtitles()
    {
        return jobtitles;
    }

    public void setJobtitles(List<JobTitle> jobtitles)
    {
        this.jobtitles = jobtitles;
    }
}