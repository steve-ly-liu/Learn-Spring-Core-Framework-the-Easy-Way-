package org.company.destroymethod.config;

import org.company.destroymethod.Server;
import org.company.destroymethod.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public Server prototypeDestroy() {
        return new Server();
    }

    @Bean(name = "serverConfig")
    public ServerConfig serverConfig() {
        return new ServerConfig(new Server());
    }
}
