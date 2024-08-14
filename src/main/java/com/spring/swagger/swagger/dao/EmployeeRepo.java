package com.spring.swagger.swagger.dao;

import com.spring.swagger.swagger.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<Employee,Long> {
}
