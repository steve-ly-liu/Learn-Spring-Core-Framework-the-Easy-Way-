package com.example.xmluseconfigurationclass.config;

import com.example.xmluseconfigurationclass.Server;
import com.example.xmluseconfigurationclass.ServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Autowired
    private ServerConfig serverConfig;

    @Bean
    public Server server() {
        return new Server(serverConfig);
    }
}
