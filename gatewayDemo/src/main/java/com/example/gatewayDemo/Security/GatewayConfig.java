package com.example.gatewayDemo.Security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfig {
    
    @Autowired
    AuthenticationFilter filter;

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
        .route(p -> p
	            .path("/employeeService/**")
	            .filters(f -> 
				            f.rewritePath("/employeeService/(?<segment>.*)","/${segment}").filter(filter))
	            .uri("lb://EMPLOYEE-WS"))
			        .route(p -> p
	            .path("/loginService/**")
	            .filters(f -> f.rewritePath("/loginService/(?<segment>.*)","/${segment}"))
	            .uri("lb://LOGIN-WS"))
                .build();
    }
}
