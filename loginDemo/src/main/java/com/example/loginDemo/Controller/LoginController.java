package com.example.loginDemo.Controller;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.loginDemo.Entity.LoginEntity;
import com.example.loginDemo.Service.LoginService;

// import jakarta.validation.Valid;

@RestController
public class LoginController {
    
    @Autowired
    LoginService loginService;

    @GetMapping("/login/{id}")
    public ResponseEntity<LoginEntity> getUser(@RequestBody LoginEntity user) {
        Optional<LoginEntity> queryResult = loginService.findById(user.getId());

        if (!queryResult.isPresent()) {
            return new ResponseEntity<LoginEntity>(HttpStatus.UNAUTHORIZED);
        }

        LoginEntity getUser = queryResult.get();
        
        return new ResponseEntity<>(getUser, HttpStatus.OK); 
    }

    // @PostMapping("/register")
    // public ResponseEntity<HttpStatus> createLogin(@Valid @RequestBody LoginEntity login) {
    //     loginService.saveLogin(login);
    //     return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
    // }

    
}
