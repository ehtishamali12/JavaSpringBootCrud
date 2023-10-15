package com.developer.employeemanagement.service.impl;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.repositriy.EmployeeRepositriy;
import com.developer.employeemanagement.service.EmployeeService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepositriy _employeeRepositriy;
    public EmployeeServiceImpl(EmployeeRepositriy employeeRepositriy){
        this._employeeRepositriy = employeeRepositriy;
    }
    @Override
    public List<EmployeeEntity> getAllEmployees() {
        return _employeeRepositriy.findAll();
    }

    @Override
    public Optional<EmployeeEntity> getByIdEmployee(Long Id) {
        return _employeeRepositriy.findById(Id);
    }

    @Override
    public EmployeeEntity saveEmployee(EmployeeEntity employeeEntity) {
        return _employeeRepositriy.save(employeeEntity);
    }

    @Override
    public EmployeeEntity updateEmployee(EmployeeEntity employeeEntity) {
        return _employeeRepositriy.save(employeeEntity);
    }

    @Override
    public void deleteEmployee(Long Id) {
        _employeeRepositriy.deleteById(Id);
    }
}
