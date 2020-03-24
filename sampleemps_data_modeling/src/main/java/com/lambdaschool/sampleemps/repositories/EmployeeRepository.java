package com.lambdaschool.sampleemps.repositories;

import com.lambdaschool.sampleemps.models.Employee;
import com.lambdaschool.sampleemps.views.EmpNameCountJobs;
import com.lambdaschool.sampleemps.views.JustTheCount;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmployeeRepository
    extends CrudRepository<Employee, Long>
{
    List<Employee> findByNameContainingIgnoreCase(String subname);

    List<Employee> findByEmails_EmailContainingIgnoreCase(String subemail);

    @Query(value = "SELECT e.name as employee_name, count(et.employeeid) as count_job_titles FROM employees e LEFT JOIN employeetitles et ON e.employeeid = et.employeeid GROUP BY e.name",
        nativeQuery = true)
    List<EmpNameCountJobs> getCountEmpJobs();

    @Query(value = "SELECT COUNT(*) as count FROM EmployeeTitles WHERE employeeid = :employeeid AND jobtitleid = :jobtitleid",
        nativeQuery = true)
    JustTheCount checkEmpJobTitleCombo(
        long employeeid,
        long jobtitleid);

    @Transactional
    @Modifying
    @Query(value = "DELETE FROM employeetitles WHERE employeeid = :employeeid AND jobtitleid = :jobtitleid", nativeQuery = true)
    void deleteEmployeeJobTitleCombo(
        long employeeid,
        long jobtitleid);

    @Transactional
    @Modifying
    @Query(value = "INSERT INTO employeetitles(employeeid, jobtitleid, manager, created_by, created_date, last_modified_by, last_modified_date) VALUES (:employeeid, :jobtitleid, :manager, :uname, CURRENT_TIMESTAMP, :uname, CURRENT_TIMESTAMP)",
        nativeQuery = true)
    void insertEmployeeJobTitleCombo(
        String uname,
        long employeeid,
        long jobtitleid,
        String manager);
}
