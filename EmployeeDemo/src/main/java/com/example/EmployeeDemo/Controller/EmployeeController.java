package com.example.EmployeeDemo.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.EmployeeDemo.Entity.Employee;
import com.example.EmployeeDemo.Service.EmployeeService;

@RestController
public class EmployeeController {
    
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/")
    public ResponseEntity<List<Employee>> getEmployee() {
        List<Employee> employees = employeeService.getEmployees();
        return new ResponseEntity<List<Employee>>(employees, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Employee> getEmployee(@PathVariable Long id) throws Exception {
        Employee employee = employeeService.getEmployee(id);
        return new ResponseEntity<Employee>(employee, HttpStatus.OK);
    }

    @PostMapping("/")
    public ResponseEntity<String> addEmployee(@RequestBody Employee employee) {
        Long returnedId = employeeService.addEmployee(employee);
        String message = "Added employee with id of: " + returnedId;
        return new ResponseEntity<>(message, HttpStatus.CREATED);
    }

    // new
    @PutMapping("/{id}")
    public ResponseEntity<Employee> updateEmployee(@RequestBody Employee employee) {
        Optional<Employee> queryResult = employeeService.findById(employee.getId());

        if (!queryResult.isPresent()) {
            return new ResponseEntity<Employee>(HttpStatus.NOT_FOUND);
        }

        Employee updatedEmployee = queryResult.get();

        updatedEmployee.updateFields(employee);

        employeeService.updateEmployee(updatedEmployee);

        return new ResponseEntity<Employee>(updatedEmployee, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long userId) {
        
        employeeService.deleteEmployee(userId);
        return new ResponseEntity<>("Employee deleted", HttpStatus.OK);
    }
}