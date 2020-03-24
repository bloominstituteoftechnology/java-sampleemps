package com.lambdaschool.sampleemps;

import com.github.javafaker.Faker;
import com.lambdaschool.sampleemps.models.Email;
import com.lambdaschool.sampleemps.models.Employee;
import com.lambdaschool.sampleemps.models.EmployeeTitles;
import com.lambdaschool.sampleemps.models.JobTitle;
import com.lambdaschool.sampleemps.repositories.EmployeeRepository;
import com.lambdaschool.sampleemps.repositories.JobTitleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.*;

@Transactional
@Component
public class SeedData implements CommandLineRunner
{
    @Autowired
    private EmployeeRepository employeerepos;

    @Autowired
    private JobTitleRepository jobTitlerepos;

    private Random random = new Random();

    @Override
    public void run(String... args) throws Exception
    {
        JobTitle jt1 = new JobTitle();
        jt1.setTitle("Big Boss");
        jobTitlerepos.save(jt1);

        JobTitle jt2 = new JobTitle();
        jt2.setTitle("Wizard");
        jobTitlerepos.save(jt2);

        /*
         * Create an arraylist to hold the job titles for this employee
         */
        ArrayList<EmployeeTitles> empTitlesList = new ArrayList<>();
        empTitlesList.add(new EmployeeTitles(new Employee(),
            jt1,
            "MOJO"));
        empTitlesList.add(new EmployeeTitles(new Employee(),
            jt2,
            "STUBS"));

        Employee emp1 = new Employee("CINNAMON",
            80000.00,
            empTitlesList);
        emp1.getEmails()
            .add(new Email("hops@local.com",
                emp1));
        emp1.getEmails()
            .add(new Email("bunny@hoppin.local",
                emp1));
        employeerepos.save(emp1);

        /*
         * Big Boss
         * reinitialize the arraylist. Since the employee is different in each list, his must be done for each employee.
         */
        empTitlesList = new ArrayList<>();
        empTitlesList.add(new EmployeeTitles(new Employee(),
            jt1,
            "STUBS"));

        Employee emp2 = new Employee("BARNBARN",
            80000.00,
            empTitlesList);
        emp2.getEmails()
            .add(new Email("barnbarn@local.com",
                emp2));
        employeerepos.save(emp2);

        /*
         * Another Big Boss but still have reinitialize the array!
         */
        empTitlesList = new ArrayList<>();
        empTitlesList.add(new EmployeeTitles(new Employee(),
            jt1,
            "MOJO"));

        Employee emp3 = new Employee("JOHN",
            75000.00,
            empTitlesList);
        employeerepos.save(emp3);

        // Javafaker code begins!

        Faker nameFaker = new Faker(new Locale("en-US"));

        // this section gets a unique list of names
        Set<String> empNamesSet = new HashSet<>();
        for (int i = 0; i < 25; i++)
        {
            empNamesSet.add(nameFaker.name()
                .fullName());
        }

        for (String empName : empNamesSet)
        {
            // Javafaker employees has no job titles.
            empTitlesList = new ArrayList<>();
            double fakerSalary = 50000.00 + (100000.00 * random.nextDouble());
            Employee employee = new Employee(empName,
                fakerSalary,
                empTitlesList); // create a new employee object that will be removed at the end of the loop body

            int randomInt = random.nextInt(3); // random number of emails from 0 - 2
            for (int j = 0; j < randomInt; j++)
            {
                employee.getEmails()
                    .add(new Email(nameFaker.internet()
                        .emailAddress(),
                        employee));
            }
            employeerepos.save(employee);
        }
    }
}
