package com.bennetty74;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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

}
