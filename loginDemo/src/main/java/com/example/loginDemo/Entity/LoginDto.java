package com.example.loginDemo.Entity;

import jakarta.validation.constraints.NotBlank;

public class LoginDto {

    // @NotBlank(message = "User does not exist")
    // private String id;

    @NotBlank(message = "Requires password")
    private String password;

    @NotBlank(message = "Requires email")
    private String email;

    private String role;

    public LoginDto() {
    }

    public LoginDto(/*String id,*/ String password, String email, String role) {

        // this.id = id;
        this.password = password;
        this.email = email;
        this.role = role;
    }

//     public LoginDto(LoginEntity loginEntity) {

//         this.id = loginEntity.getUser();
//         this.password = loginEntity.getPassword();
//         // this.email = loginEntity.getemail();
//     }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    // public String getUser() {
    //     return this.id;
    // }

    // public void setUser(String id) {
    //     this.id = id;
    // }


    public String getRole() {
        return this.role;
    }

    public void setRole(String role) {
        this.role = role;
    }

}
