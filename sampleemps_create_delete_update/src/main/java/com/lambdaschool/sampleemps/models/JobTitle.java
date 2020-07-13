package com.lambdaschool.sampleemps.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "jobtitles")
public class JobTitle
{
    @Id // The primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // We will let the database decide how to generate it
    private long jobtitleid; // long so we can have many rows

    private String title;

    @ManyToMany(mappedBy = "jobtitles")
    // we want to ignore, not display, the jobtitles collection from Employee
    @JsonIgnoreProperties("jobtitles")
    private Set<Employee> employees = new HashSet<>();

    public JobTitle()
    {
        // the default constructor is required by the JPA
    }

    public long getJobtitleid()
    {
        return jobtitleid;
    }

    public void setJobtitleid(long jobtitleid)
    {
        this.jobtitleid = jobtitleid;
    }

    public String getTitle()
    {
        return title;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public Set<Employee> getEmployees()
    {
        return employees;
    }

    public void setEmployees(Set<Employee> employees)
    {
        this.employees = employees;
    }
}