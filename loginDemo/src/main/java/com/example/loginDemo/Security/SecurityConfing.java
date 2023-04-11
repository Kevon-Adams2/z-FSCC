package com.example.loginDemo.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;
// import org.springframework.security.web.util.matcher.RequestMatcher;

// import com.example.loginDemo.Security.Filter.AuthenticationFilter;
// import com.example.loginDemo.Security.Filter.ExceptionHandlerFilter;
// import com.example.loginDemo.Security.Filter.JWTAuthorizationFilter;
// import com.example.loginDemo.Security.Manager.CustomAuthenticationManager;

import org.springframework.security.config.http.SessionCreationPolicy;

@Configuration
public class SecurityConfing {

    @Bean
	SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http) throws Exception {
		http.csrf().disable()
                        .authorizeHttpRequests()
                        .requestMatchers("/test").authenticated()
                        .requestMatchers("/allow","/register").permitAll()
		        .and().formLogin()
		        .and().httpBasic();
		return http.build();
	}


    // @Autowired
    // private CustomAuthenticationManager customAuthenticationManager;

    // @Bean
    // public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
    //     AuthenticationFilter authenticationFilter = new AuthenticationFilter(customAuthenticationManager);
    //     authenticationFilter.setFilterProcessesUrl("/authenticate");
    //     http        
    //         .headers().frameOptions().disable()
    //         .and()
    //         .csrf().disable()
    //         .authorizeHttpRequests()
    //         .requestMatchers(HttpMethod.POST, SecurityConstants.REGISTER_PATH).permitAll()
    //         .anyRequest().authenticated()
    //         .and()
    //         .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
    //         .addFilter(authenticationFilter)
    //         .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
    //         .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
    //     // http.authorizeHttpRequests().requestMatchers(HttpMethod.POST, SecurityConstants.LOGIN_PATH).permitAll()
    //     // .anyRequest().authenticated();
    //     return http.build();
    // }
}
