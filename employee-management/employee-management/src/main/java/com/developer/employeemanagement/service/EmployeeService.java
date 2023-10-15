package com.developer.employeemanagement.service;

import com.developer.employeemanagement.entity.EmployeeEntity;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {
    List<EmployeeEntity> getAllEmployees();
    Optional<EmployeeEntity> getByIdEmployee(Long Id);
    EmployeeEntity saveEmployee(EmployeeEntity employeeEntity);
    EmployeeEntity updateEmployee(EmployeeEntity employeeEntity);
    void deleteEmployee(Long Id);
}
