package org.company.instancefactorymethod.config;

import org.company.instancefactorymethod.ServerManager;
import org.company.instancefactorymethod.ServerManagerFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public ServerManager serverManager() {
        ServerManagerFactoryBean factoryBean = new ServerManagerFactoryBean();
        return factoryBean.createServerManagerInstance(1234);
    }

}
