package com.example.loginDemo.Controller;


// import java.util.List;
// import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.*;

// import com.example.loginDemo.Entity.LoginDto;
import com.example.loginDemo.Entity.LoginEntity;
import com.example.loginDemo.Exception.UserNotFoundException;
import com.example.loginDemo.Security.TokenGenerator.*;
import com.example.loginDemo.Service.LoginService;

// import jakarta.validation.Valid;

@RestController
@RequestMapping()
public class LoginController {
    
    @Autowired
    private LoginService loginService;
    // private JwtGeneratorInterface jwtGenerator;

    @Autowired
    private PasswordEncoder passwordEncoder;

    
    public LoginController(LoginService loginService/*, JwtGeneratorInterface jwtGenerator*/) {
        this.loginService = loginService;
        // this.jwtGenerator = jwtGenerator;
    }

    @GetMapping("/test")
    public String getTestDetails() {
        return "Here is the test";
    }

    @GetMapping("/allow")
    public String getAllowDetails() {
        return "You are allowed to see";
    }

    @PostMapping("/register")
    public ResponseEntity<?> postUser(@RequestBody LoginEntity loginEntity) {
        try{
            String hashPassword = passwordEncoder.encode(loginEntity.getPassword());
            loginEntity.setPassword(hashPassword);
            loginService.saveUser(loginEntity);
            return new ResponseEntity<>(loginEntity, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    // @PostMapping()
    // public ResponseEntity<?> loginUser(@RequestBody LoginEntity loginEntity) {
    //     try{
    //         if (loginEntity.getUserName() == null || loginEntity.getPassword() == null) {
    //             throw new UserNotFoundException("UserName or Password is empty");
    //         }
    //         LoginEntity userData = loginService.getUserByNameAndPassword(loginEntity.getUserName(), loginEntity.getPassword());
    //         if(userData == null) {
    //             throw new UserNotFoundException("UserName or Password is invalid");
    //         }
    //             return new ResponseEntity<>(jwtGenerator.generateToken(loginEntity), HttpStatus.OK);
    //         } catch (UserNotFoundException e) {
    //         return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
    //         }
    //     }


    // @GetMapping("/login/{id}")
    // public ResponseEntity<LoginEntity> getUser(@RequestBody LoginEntity user) {
    //     Optional<LoginEntity> queryResult = loginService.findById(user.getId());

    //     if (!queryResult.isPresent()) {
    //         return new ResponseEntity<LoginEntity>(HttpStatus.UNAUTHORIZED);
    //     }

    //     LoginEntity getUser = queryResult.get();
        
    //     return new ResponseEntity<>(getUser, HttpStatus.OK); 
    // }

    // @GetMapping("/login")
    // public ResponseEntity<List<LoginEntity>> getAllUsers() {
    //     List<LoginEntity> users = loginService.getAllUsers();
    //     return new ResponseEntity<List<LoginEntity>>(users, HttpStatus.OK);
    // }
    

    // @PostMapping("/register")
	// public ResponseEntity<String> registerUser(@RequestBody @Valid LoginDto loginInfo) {
	// 	String message = loginService.saveUser(loginInfo);
	// 	return new ResponseEntity<>(message, HttpStatus.CREATED); 
	// }

    
}
