package org.company.initdestoryannotation.config;

import org.company.initdestoryannotation.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class JavaConfig {
    @Bean
    public ServerConfig serverConfig() {
        ServerConfig serverObject =  new ServerConfig(2002, "192.168.0.300", "java_config", "123");
        Map<String, String> serverParam = new HashMap<>();
        serverParam.put("CPU-Cores", "64");
        serverParam.put("RAM", "1024GB");
        serverObject.setConfigParams(serverParam);
        return serverObject;
    }
}
