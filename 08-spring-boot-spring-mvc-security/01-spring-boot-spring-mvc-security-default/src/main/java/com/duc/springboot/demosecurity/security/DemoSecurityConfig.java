package com.duc.springboot.demosecurity.security;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

@Configuration
public class DemoSecurityConfig {

    @Bean
    public InMemoryUserDetailsManager userDetailsManager() {

        UserDetails duc = User.builder()
                .username("duc")
                .password("{noop}123456")
                .roles("Admin", "Manager", "Employee")
                .build();

        UserDetails ronaldo = User.builder()
                .username("ronaldo")
                .password("{noop}123456")
                .roles("Manager", "Employee")
                .build();

        UserDetails messi = User.builder()
                .username("messi")
                .password("{noop}123456")
                .roles("Employee")
                .build();
        return new InMemoryUserDetailsManager(duc, ronaldo, messi);
    }
}
