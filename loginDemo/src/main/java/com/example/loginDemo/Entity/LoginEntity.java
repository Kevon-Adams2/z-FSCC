package com.example.loginDemo.Entity;


import org.hibernate.annotations.GenericGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO,generator="native")
    @GenericGenerator(name = "native",strategy = "native")
    private int id;
    
    private String userName;
    
    // private String email;

    private String password;

    // private String role;


    public LoginEntity() {

    }


    public LoginEntity(int id, String userName, String password) {
        this.id = id;

        // this.email = email;
        
        this.userName = userName;
        
        this.password = password;

        // this.role = role;
    }

    // public LoginEntity(LoginDto loginDto) {
    //     this.username = loginDto.getUser();
    //     this.password = loginDto.getPassword();
    // }
    

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // public String getEmail() {
    //     return this.email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }
    


    // public String getRole() {
    //     return this.role;
    // }

    // public void setRole(String role) {
    //     this.role = role;
    // }


}

