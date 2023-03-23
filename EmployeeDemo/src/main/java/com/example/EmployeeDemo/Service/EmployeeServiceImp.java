package com.example.EmployeeDemo.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.EmployeeDemo.Entity.Employee;
import com.example.EmployeeDemo.Repository.EmployeeRepository;

// import java.util.stream.IntStream;


@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;

    @Override
    public Employee getEmployee(Long id) throws Exception {
        Employee Employee = employeeRepository
            .findById(id).orElseThrow(
                () -> new Exception("Employee not found")
            );
        return Employee;
    }

    @Override
    public List<Employee> getEmployees() {
        List<Employee> employees = new ArrayList<>();
        employeeRepository.findAll().forEach(employee -> employees.add(employee));
        return employees;
    }

    @Override
    public Long addEmployee(Employee employee) {
        Long id = employeeRepository.save(employee).getId();
        return id;
    }

    // new
    @Override
    public Optional<Employee> findById(Long id) {
        return employeeRepository.findById(id);
    }

    @Override
    public Employee updateEmployee(Employee updatedEmployee) {
        return employeeRepository.save(updatedEmployee);
    }

    @Override
    public void deleteEmployee(Long userId) {
        employeeRepository.deleteById(userId);
    }

    // @Override
    // public void doesEmployeeExist(Employee id) {
    //     return employeeRepository.existById(id);
    // }
    
}