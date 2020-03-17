package com.lamdaschool.sampleemps.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "jobtitles")
public class JobTitle
{
    @Id // The primary key
    @GeneratedValue(strategy = GenerationType.AUTO) // We will let the database decide how to generate it
    private long jobtitleid; // long so we can have many rows

    @Column(nullable = false,
        unique = true)
    private String title;

    @ManyToMany(mappedBy = "jobtitles")
    @JsonIgnoreProperties("jobtitles")
    private List<Employee> employees = new ArrayList<>();

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

    public List<Employee> getEmployees()
    {
        return employees;
    }

    public void setEmployees(List<Employee> employees)
    {
        this.employees = employees;
    }
}