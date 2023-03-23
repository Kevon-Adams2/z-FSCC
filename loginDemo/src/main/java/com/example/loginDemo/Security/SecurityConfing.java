// package com.example.loginDemo.Security;

// import org.springframework.context.annotation.Bean;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.http.HttpMethod;
// import org.springframework.security.config.annotation.web.builders.HttpSecurity;
// import org.springframework.security.web.SecurityFilterChain;

// import com.example.loginDemo.Security.Filter.AuthenticationFilter;
// import com.example.loginDemo.Security.Filter.JWTAuthorizationFilter;
// import com.example.loginDemo.Security.Manager.CustomAuthenticationManager;

// @Configuration
// public class SecurityConfing {
//     CustomAuthenticationManager customAuthenticationManager;

//     @Bean
//     public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//         AuthenticationFilter authenticationFilter = new AuthenticationFilter(customAuthenticationManager);
//         authenticationFilter.setFilterProcessesUrl("/authenticate");
//         http        
//             .headers().frameOptions().disable()
//             .and()
//             .csrf().disable()
//             .authorizeHttpRequests()
//             .antMatchers(HttpMethod.POST, SecurityConstants.REGISTER_PATH).permitAll()
//             .anyRequest().authenticated()
//             .and()
//             .addFilterBefore(new ExceptionHandlerFilter(), AuthenticationFilter.class)
//             .addFilter(authenticationFilter)
//             .addFilterAfter(new JWTAuthorizationFilter(), AuthenticationFilter.class)
//             .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
//         return http.build();
//     }
// }