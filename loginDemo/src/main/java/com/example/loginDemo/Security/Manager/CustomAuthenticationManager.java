package com.example.loginDemo.Security.Manager;


import java.util.ArrayList;
// import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
// import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

// import com.example.loginDemo.Entity.LoginDto;
import com.example.loginDemo.Entity.LoginEntity;
import com.example.loginDemo.Repository.LoginRepository;
// import com.example.loginDemo.Service.LoginService;

@Component
public class CustomAuthenticationManager implements AuthenticationProvider {

    // @Autowired
    // private LoginService loginService;
    @Autowired
    private PasswordEncoder passwordEncoder;
    // private BCryptPasswordEncoder bCryptPasswordEncoder;
    @Autowired
    private LoginRepository loginRepository;

    // @Override
    // public Authentication authenticate(Authentication authentication) throws AuthenticationException {
    //     LoginDto login = loginService.checkLogin(authentication.getName());
    //     if (!bCryptPasswordEncoder.matches(authentication.getCredentials().toString(), login.getPassword())) {
    //         throw new BadCredentialsException("Invalid Credentials.");
    //     }
    //     List<GrantedAuthority> authorities = new ArrayList<>();
    //     authorities.add(new SimpleGrantedAuthority(login.getRole()));
    //     return new UsernamePasswordAuthenticationToken(authentication.getName(), login.getPassword(), authorities);
    // }

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();
        List<LoginEntity> login = loginRepository.findByUserName(username);
        if (login.size() > 0) {

            if (passwordEncoder.matches(password, login.get(0).getPassword())) {
                List<GrantedAuthority> authorities = new ArrayList<>();
                authorities.add(new SimpleGrantedAuthority(login.get(0).getRole()));
                return new UsernamePasswordAuthenticationToken(username, password, authorities);                
            } else {
                throw new BadCredentialsException("Invalid Credentials.");
            }
        }else {
            throw new BadCredentialsException("No user registered with these credentials.");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return (UsernamePasswordAuthenticationToken.class.isAssignableFrom(authentication));
    }
    
}
