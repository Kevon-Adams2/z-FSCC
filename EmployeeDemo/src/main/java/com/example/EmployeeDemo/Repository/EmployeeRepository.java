package com.example.EmployeeDemo.Repository;


import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.example.EmployeeDemo.Entity.Employee;

public interface EmployeeRepository extends CrudRepository<Employee, Long>{
    
    List<Employee> findByOrderByLastNameAsc();
    
    Optional<Employee> findByEmail(String email);
    
    // new
    Optional<Employee> findById(Long id);

    // boolean existById(Employee id);
}