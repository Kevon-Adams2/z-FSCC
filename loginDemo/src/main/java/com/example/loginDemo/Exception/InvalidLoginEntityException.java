package com.example.loginDemo.Exception;

public class InvalidLoginEntityException extends RuntimeException {
    public InvalidLoginEntityException() {
        super("Invalid Login");
    }
}
