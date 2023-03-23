package com.example.loginDemo.Entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "login")
public class LoginEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // private String username;

    private String email;

    private String password;


    public LoginEntity() {

    }


    public LoginEntity(Long id, String password, String email) {
        this.id = id;

        this.email = email;
        
        // this.username = username;
        
        this.password = password;
    }

    // public LoginEntity(LoginDto loginDto) {
    //     this.username = loginDto.getUser();
    //     this.password = loginDto.getPassword();
    // }
    

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    // public String getUser() {
    //     return this.username;
    // }

    // public void setUser(String username) {
    //     this.username = username;
    // }
    
    public String getPassword() {
        return this.password;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setPassword(String password) {
        this.password = password;
    }

}

