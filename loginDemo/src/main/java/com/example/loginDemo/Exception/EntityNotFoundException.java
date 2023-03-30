package com.example.loginDemo.Exception;

public class EntityNotFoundException extends RuntimeException { 

    public EntityNotFoundException(String email) {
            super("The user with email " + email + " does not exist in our records");
    }

}