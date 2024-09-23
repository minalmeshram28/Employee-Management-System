package com.employee.springboot.repository;


import com.employee.springboot.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;


public interface EmployeeRepository extends JpaRepository<Employee, Long> {
    // all crud database methods
}