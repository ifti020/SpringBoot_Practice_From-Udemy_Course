package com.ifti.springboot.__spring_boot_rest_crud_employee.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {

    // step 1 : add support for jdbc... no more hardcode for users
    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource)
    {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain (HttpSecurity http, DataSource dataSource) throws Exception
    {



    http.authorizeHttpRequests(configurer ->
            configurer
                    .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                    .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.PUT, "/api/employees").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.PATCH, "/api/employees/**").hasRole("MANAGER")
                    .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
    );

    // USE HTTP BASIC AUTHENTICATION
        http.httpBasic(Customizer.withDefaults());

        // disable Cross site Request (CSRF)
        // in general , not required for stateless REST APIs that use Post,Put,Delete and/or Patch

        http.csrf(csrf -> csrf.disable());

        return http.build();

    }

    /*

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
*/
}
