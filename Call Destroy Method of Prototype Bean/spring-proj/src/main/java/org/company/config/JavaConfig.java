package org.company.config;

import org.company.PrototypeDestroy;
import org.company.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class JavaConfig {
	
	@Bean
	public PrototypeDestroy prototypeDestory() {
		return new PrototypeDestroy();
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	@Scope("prototype")
	public ServerConfig serverConfig() {

		return new ServerConfig();

	}

}
