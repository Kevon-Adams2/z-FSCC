package com.example.EmployeeDemo.Service;

import java.util.List;
import java.util.Optional;

import com.example.EmployeeDemo.Entity.Employee;

public interface EmployeeService {
    
    Employee getEmployee(Long id) throws Exception;
    
    
    List<Employee> getEmployees();
    
    Long addEmployee(Employee employee);

    // new addition

    // Object updateEmployee(Long id, Long id2);
    
    Optional<Employee> findById(Long id);

    Employee updateEmployee(Employee updatedEmployee);

    void deleteEmployee(Long userId);

    // public boolean doesEmployeeExist(Employee id);
}