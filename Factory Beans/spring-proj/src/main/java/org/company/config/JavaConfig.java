package org.company.config;

import org.company.ServerManager;
import org.company.ServerManagerFactoryBean;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public ServerManager serverManager() throws Exception {
		FactoryBean factoryOjb = new ServerManagerFactoryBean(123);
		return (ServerManager) factoryOjb.getObject();
	}

}
