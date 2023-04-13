package com.example.loginDemo.Entity;

import jakarta.validation.constraints.NotBlank;

public class LoginDto {

    @NotBlank(message = "User does not exist")
    private int id;

    @NotBlank(message = "Requires username")
    private String userName;

    @NotBlank(message = "Requires password")
    private String password;

    // @NotBlank(message = "Requires email")
    // private String email;

    // private String role;

    public LoginDto() {
    }

    public LoginDto(int id, String userName, String password/*, String email, String role*/) {

        this.id = id;
        this.userName = userName;
        this.password = password;
        // this.email = email;
        // this.role = role;
    }

    public LoginDto(LoginEntity loginEntity) {

        this.id = loginEntity.getId();
        this.userName = loginEntity.getUserName();
        this.password = loginEntity.getPassword();
        // this.email = loginEntity.getemail();
    }

    // public String getEmail() {
    //     return this.email;
    // }

    // public void setEmail(String email) {
    //     this.email = email;
    // }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return this.userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    // public String getUser() {
    //     return this.id;
    // }

    // public void setUser(String id) {
    //     this.id = id;
    // }


    // public String getRole() {
    //     return this.role;
    // }

    // public void setRole(String role) {
    //     this.role = role;
    // }

}
