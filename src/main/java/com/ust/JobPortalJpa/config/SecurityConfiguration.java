package com.ust.JobPortalJpa.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

/**
 * Class to configure AWS Cognito as an OAuth 2.0 authorizer with Spring Security.
 * In this configuration, we specify our OAuth Client.
 * We also declare that all requests must come from an authenticated user.
 * Finally, we configure our logout handler.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfiguration {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        LogoutHandler cognitoLogoutHandler = new LogoutHandler();

        return http
                .csrf(csrf -> csrf.disable()) // Disable CSRF if not required
                .authorizeHttpRequests(authz -> authz
                        .requestMatchers("/", "/swagger-ui/**", "/v3/api-docs/**").permitAll() // Allow public access to certain endpoints
                        .anyRequest().authenticated()) // Secure all other endpoints
                .oauth2Login(Customizer.withDefaults()) // Enable OAuth2 login
                .logout(logout -> logout
                        .logoutSuccessUrl("http://localhost:8080/swagger-ui/index.html") // Redirect after logout
                        .invalidateHttpSession(true) // Ensure session invalidation
                        .deleteCookies("JSESSIONID")) // Clear cookies
                .build(); // Build and return the SecurityFilterChain
    }
}
