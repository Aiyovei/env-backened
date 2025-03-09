package com.env.envbackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.env.envbackend.mapper")
public class EnvBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(EnvBackendApplication.class, args);
    }

}
