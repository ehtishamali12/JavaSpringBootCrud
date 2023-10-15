package com.developer.employeemanagement.controller;

import com.developer.employeemanagement.entity.EmployeeEntity;
import com.developer.employeemanagement.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService _employeeService;
    public EmployeeController(EmployeeService employeeService){
        this._employeeService = employeeService;
    }
    @GetMapping()
    public List<EmployeeEntity> getAllEmployees(){
        return _employeeService.getAllEmployees();
    }
    @GetMapping("/{id}")
    public Optional<EmployeeEntity> getByIdEmployee(@PathVariable Long id){
        return  _employeeService.getByIdEmployee(id);
    }
    @PostMapping
    public EmployeeEntity saveEmployee(@RequestBody EmployeeEntity employeeEntity){
        return  _employeeService.saveEmployee(employeeEntity);
    }
    @PutMapping
    public  EmployeeEntity updateEmployee(EmployeeEntity employeeEntity){
        return  _employeeService.updateEmployee(employeeEntity);
    }
    @DeleteMapping("/{id}")
    public void deleteEmployee(@PathVariable Long id){
        _employeeService.deleteEmployee(id);
    }
}
