package org.company.setterinjection.config;

import org.company.setterinjection.Server;
import org.company.setterinjection.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Server server() {
        return new Server();
    }

    @Bean
    public ServerConfig serverConfig() {
        ServerConfig serverConfig = new ServerConfig();
        serverConfig.setServerInstance(server());
        return serverConfig;
    }
}
