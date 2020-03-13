package com.sabekur2017.instaclonetest.config.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {
    private final PasswordEncoder passwordEncoder;
    private final UserDetailsService userDetailsService;
    @Autowired
    public WebSecurityConfiguration(PasswordEncoder passwordEncoder, UserDetailsService userDetailsService) {
        this.passwordEncoder = passwordEncoder;
        this.userDetailsService = userDetailsService;
    }
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //super.configure(http);
        http.csrf().disable();
        http
                .authorizeRequests()
                .antMatchers("/images/**","/images/posts/**","/images/profile/**","/css/**", "/js/**","/font/**","/register").permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/profile").hasRole("USER")
                .anyRequest().authenticated()
                // Here we are configuring our login form
                .and()
                .formLogin()
                .loginPage("/login") // Login page will be accessed through this endpoint. We will create a controller method for this.
                .loginProcessingUrl("/login-processing") // This endpoint will be mapped internally. This URL will be our Login form post action.
                .permitAll() // We re permitting all for login page
                .usernameParameter("username")
                .passwordParameter("password")
                .defaultSuccessUrl("/") // If the login is successful, user will be redirected to this URL.
                .failureUrl("/login?error=true") // If the user fails to login, application will redirect the user to this endpoint
                .and()
                .exceptionHandling()
                .accessDeniedHandler(new CustomAccessDeniedHandler())
                .and()
                .logout()
                .logoutUrl("/logout")
                .logoutSuccessUrl("/")
        ;

    }
}
