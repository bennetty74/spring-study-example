package com.bennetty74;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author bennetty74
 * @date 2021.9.9
 */
@SpringBootApplication
@RestController
public class DockerApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }

    public static void main(String[] args) {
        SpringApplication.run(DockerApplication.class, args);
    }

}