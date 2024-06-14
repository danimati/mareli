package com.mareli.mareli.config;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

import com.mareli.mareli.bdconfig.Entitys.ProfileEntity;
import com.mareli.mareli.bdconfig.services.ProfileService;

import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig {


    private ProfileService profileService;

    @Autowired
    public SecurityConfig(ProfileService profileService) {
        this.profileService = profileService;
    }
    

    @Bean
    public UserDetailsService userDetailsService() {
        List<UserDetails> users = new ArrayList<>();
        List<ProfileEntity> personas = profileService.getPersonas();
        for(ProfileEntity persona : personas){
            users.add(User.withUsername(persona.getUsuario())
            .password(persona.getContrasenia())
            .authorities("READ")
            .build());
        }
        
        return new InMemoryUserDetailsManager(users);
    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
    


}
