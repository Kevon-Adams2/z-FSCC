// package com.example.loginDemo.Security.Manager;


// import org.springframework.security.authentication.AuthenticationManager;
// import org.springframework.security.authentication.BadCredentialsException;
// import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
// import org.springframework.security.core.Authentication;
// import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
// import org.springframework.stereotype.Component;

// import com.example.loginDemo.Entity.LoginEntity;
// import com.example.loginDemo.Service.LoginService;

// @Component
// public class CustomAuthenticationManager implements AuthenticationManager {

//     private LoginService loginServiceImp;
//     private BCryptPasswordEncoder bCryptPasswordEncoder;

//     public Authentication authentication(Authentication authentication) throws AuthenticationException {
//         LoginEntity login = loginServiceImp.getLogin(authentication.getName());
//         if (!bCryptPasswordEncoder.matches(authentication.getCredentials().toString(), login.getPassword())) {
//             throw new BadCredentialsException("Incorrect Password");
//         }
//         return new UsernamePasswordAuthenticationToken(authentication.getName(), login.getPassword());
//     }
    
// }
