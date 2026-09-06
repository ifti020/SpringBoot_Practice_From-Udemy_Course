package com.ifti.springboot.__spring_boot_rest_crud_employee.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {
        UserDetails ifti = User.builder()
                .username("ifti")
                .password("{noop}test123")
                .roles("EMPLOYEE")
                .build();

        UserDetails parama = User.builder()
                .username("parama")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER")
                .build();

        UserDetails shohan = User.builder()
                .username("shohan")
                .password("{noop}test123")
                .roles("EMPLOYEE", "MANAGER", "ADMIN")
                .build();

        return new InMemoryUserDetailsManager(ifti,parama,shohan);
    }
}
