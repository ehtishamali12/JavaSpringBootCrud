package com.developer.employeemanagement.repositriy;

import com.developer.employeemanagement.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepositriy extends JpaRepository<EmployeeEntity, Long> {
}
