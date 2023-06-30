package com.example.startstopcallback;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class JavaConfig {
    @Bean
    public ServerConfig serverConfig() {
        ServerConfig serverObject =  new ServerConfig(2002, "192.168.0.200", "steve", "123");
        Map<String, String> serverParam = new HashMap<>();
        serverParam.put("CPU-Cores", "32");
        serverParam.put("RAM", "512GB");
        serverObject.setConfigParams(serverParam);
        return serverObject;
    }

    @Bean
    public Server serverBean(ServerConfig config) {
        return new Server(config);
    }
}
