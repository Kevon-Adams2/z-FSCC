package com.example.loginDemo.Exception;

public class InvalidRoleException extends RuntimeException {
    public InvalidRoleException() {
        super("Invalid Role.");
    }
}
