 /*package com.mareli.mareli.config;

 import java.util.ArrayList;
 import java.util.List;

 import org.springframework.beans.factory.annotation.Autowired;
 import org.springframework.context.annotation.Bean;
 import org.springframework.context.annotation.Configuration;
 import org.springframework.security.authentication.AuthenticationManager;
 import org.springframework.security.authentication.AuthenticationProvider;
 import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
 import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
 import org.springframework.security.config.annotation.web.builders.HttpSecurity;
 import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
 import org.springframework.security.core.userdetails.User;
 import org.springframework.security.core.userdetails.UserDetails;
 import org.springframework.security.core.userdetails.UserDetailsService;
 import org.springframework.security.crypto.factory.PasswordEncoderFactories;
 import org.springframework.security.crypto.password.PasswordEncoder;
 import org.springframework.security.web.SecurityFilterChain;

 import com.mareli.mareli.bdconfig.Entitys.ProfileEntity;
 import com.mareli.mareli.bdconfig.services.ProfileService;

 import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
 import org.springframework.security.provisioning.InMemoryUserDetailsManager;
 import org.springframework.security.provisioning.UserDetailsManager;
 import org.springframework.security.crypto.password.NoOpPasswordEncoder;
 import org.springframework.security.crypto.password.PasswordEncoder;



 @Configuration
 @EnableWebSecurity
 @EnableMethodSecurity
 public class WebSecurityConfig {
    @Autowired
    AuthenticationConfiguration authenticationConfiguration;
    
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {
        return httpSecurity.build();
    }

    @Bean
    public AuthenticationManager authenticationManager() throws Exception {
        return authenticationConfiguration.getAuthenticationManager();
    }
    @Bean
    public AuthenticationProvider authenticationProvider() {
            
        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();
        provider.setPasswordEncoder(passwordEncoder());
        provider.setUserDetailsService(userDetailService());
        return provider;
    }
    //OJO AQUI CTM
    @Bean
    public UserDetailsService userDetailService() {
        List<UserDetails> users = new ArrayList<>();

        users.add(User.withUsername("Mateo")
                        .password("Clave")
                        .roles("USER")
                        .authorities("READ","CREATE")
                        .build());
        users.add(User.withUsername("Sebastian")
                        .password("Clave")
                        .roles("USER")
                        .authorities("READ","CREATE")
                        .build());

        //  List<ProfileEntity> aux = profileService.getPersonas();

        //  for (ProfileEntity profileEntity : aux) {
        //  UserDetails userauxiliar;
        //  userauxiliar = User.withUsername(profileEntity.getUsuario())
        //                      .password(profileEntity.getContrasenia())
        //                      .roles("USER")
        //                      .authorities("READ","CREATE")
        //                      .build();

        //  users.add(userauxiliar);
        //  }

        return new InMemoryUserDetailsManager(users);
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return NoOpPasswordEncoder.getInstance();
    }
}*/