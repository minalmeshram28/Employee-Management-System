package com.employee.springboot.controller;

import com.employee.springboot.dto.EmployeeDto;
import com.employee.springboot.exception.ResourceNotFoundException;
import com.employee.springboot.entity.Employee;
import com.employee.springboot.repository.EmployeeRepository;
import com.employee.springboot.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@CrossOrigin("*")
@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    // build create employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedEmployee=employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedEmployee,HttpStatus.CREATED);
    }

    //build get employee by id REST API

    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
        EmployeeDto employeeDto=employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    //    build get all employees REST API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees(){
        List<EmployeeDto> employees=employeeService.getAllEmployees();
        return ResponseEntity.ok(employees);
    }

    //build update employee REST API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> updateEmployee(@PathVariable("id") Long employeeId,@RequestBody EmployeeDto updatedEmployee){
        EmployeeDto employeeDto=employeeService.updateEmployee(employeeId,updatedEmployee);
        return ResponseEntity.ok(employeeDto);
    }

    //build delete employee REST API
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        employeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("Employee deleted successfully!");
    }

}