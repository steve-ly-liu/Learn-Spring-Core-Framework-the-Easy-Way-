package org.company.config;

import org.company.ServerManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean
	public ServerManager serverManager() {
		return ServerManager.getInstance(1345);
	}

}
