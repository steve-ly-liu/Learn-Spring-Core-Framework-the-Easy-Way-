package org.company.factorybean.config;

import org.company.factorybean.ServerManager;
import org.company.factorybean.ServerManagerFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public ServerManager serverManager() throws Exception {
        FactoryBean factoryBean = new ServerManagerFactoryBean(123);
        return (ServerManager) factoryBean.getObject();
    }
}
