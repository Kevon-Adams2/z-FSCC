package com.example.loginDemo.Service;

// import java.util.List;
import java.util.Optional;

// import com.example.loginDemo.Entity.LoginDto;
import com.example.loginDemo.Entity.LoginEntity;

public interface LoginService {
    
    // LoginEntity getLogin(Long id) /*throws Exception*/;

    // Optional<LoginEntity> getCredentials(String username);

    // boolean doesUserExist(String username);

    // LoginEntity saveLogin(LoginEntity login);

    // List<LoginEntity> getAllUsers();

    // void createNewUser(LoginDto userInput);

    // LoginEntity getUser(String username);

    Optional<LoginEntity> findById(Long id);
}
