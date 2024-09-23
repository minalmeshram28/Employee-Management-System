package com.employee.springboot.service.impl;

import com.employee.springboot.dto.EmployeeDto;
import com.employee.springboot.entity.Employee;
import com.employee.springboot.exception.ResourceNotFoundException;
import com.employee.springboot.mapper.EmployeeMapper;
import com.employee.springboot.repository.EmployeeRepository;
import com.employee.springboot.service.EmployeeService;
import org.springframework.stereotype.Service;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {

        Employee employee= EmployeeMapper.mapToEmployee(employeeDto);
        Employee savedEmployee=employeeRepository.save(employee);
        return EmployeeMapper.mapToEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(Long employeeId) {
        Employee employee=employeeRepository.findById(employeeId).
                orElseThrow(()->
                        new ResourceNotFoundException("Employee does not exist with given id"+ employeeId));
        return EmployeeMapper.mapToEmployeeDto(employee);
    }
}
