package org.company.config;

import java.util.HashMap;
import java.util.Map;

import org.company.BPP;
import org.company.ServerConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean
	public BPP bpp() {
		return new BPP();
	}

	@Bean(initMethod = "init", destroyMethod = "destroy")
	public ServerConfig serverConfig() {

		Map<String, String> configParams = new HashMap<String, String>();
		configParams.put("ram", "160GB");
		configParams.put("cpu-cores", "16");

		ServerConfig serverConfig = new ServerConfig(11011, "124.43.122.113", "rootuser12", "root123#$");

		serverConfig.setConfigParms(configParams);

		return serverConfig;
	}

}
