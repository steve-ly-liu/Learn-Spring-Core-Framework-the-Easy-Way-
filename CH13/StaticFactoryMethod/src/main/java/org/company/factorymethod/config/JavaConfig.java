package org.company.factorymethod.config;

import org.company.factorymethod.ServerManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public ServerManager serverManager() {
        return ServerManager.getServerManagerInstance(1234);
    }
}
