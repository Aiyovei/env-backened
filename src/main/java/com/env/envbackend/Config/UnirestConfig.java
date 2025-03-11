package com.env.envbackend.Config;

import jakarta.annotation.PostConstruct;
import kong.unirest.Unirest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UnirestConfig {

    @PostConstruct
    public void configureUnirest() {
        Unirest.config().socketTimeout(5000).connectTimeout(5000); // 设置超时时间
    }
}