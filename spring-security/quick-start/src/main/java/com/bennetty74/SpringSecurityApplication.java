package com.bennetty74;

import com.bennetty74.service.ExampleUserDetailServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Bennetty74
 * @date 2021.9.10
 */

@RestController
@SpringBootApplication
public class SpringSecurityApplication {


    @GetMapping("/")
    public String hello(){
        return "Hello Spring Security";
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringSecurityApplication.class, args);
    }

    /**
     * Specify the encryption method, this example uses {@link BCryptPasswordEncoder} as password encoder
     * @return a specific password encoder
     */
    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }


}
