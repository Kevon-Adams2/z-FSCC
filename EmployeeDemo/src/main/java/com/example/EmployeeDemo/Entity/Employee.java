package com.example.EmployeeDemo.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String userId;

    private String firstName;

    private String lastName;

    private String address;

    private String city;

    private String state;

    private String zip;

    private String cellPhone;

    private String homePhone;

    private String email;


    public Employee() {
    }

    public Employee(Long id, String userId, String firstName, String lastName, String address, String city, String state, String zip, String cellPhone, String homePhone, String email) {
        this.id = id;
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.cellPhone = cellPhone;
        this.homePhone = homePhone;
        this.email = email;
    
    }
    
    // new
    public void updateFields(Employee updb) {
        this.id = updb.id;
        this.userId = updb.userId;
        this.firstName = updb.firstName;
        this.lastName = updb.lastName;
        this.address = updb.address;
        this.city = updb.city;
        this.state = updb.state;
        this.zip = updb.zip;
        this.cellPhone = updb.cellPhone;
        this.homePhone = updb.homePhone;
        this.email = updb.email;
    }


    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserId() {
        return this.userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public String getCellPhone() {
        return this.cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getHomePhone() {
        return this.homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}