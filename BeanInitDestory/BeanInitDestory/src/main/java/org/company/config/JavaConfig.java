package org.company.config;

import org.company.ServerConfig;
import org.springframework.context.annotation.Bean;

import java.util.HashMap;
import java.util.Map;

public class JavaConfig {
    @Bean(initMethod = "afterPropertiesSet", destroyMethod = "destroy")
    public ServerConfig serverConfig() {
        Map<String, String> configParams = new HashMap<>();
        configParams.put("RAM", "320 GB");
        configParams.put("CPU-CORES", "32");

        ServerConfig serverConfig = new ServerConfig(22022, "192.168.0.100", "rootuser", "rootpwd");
        serverConfig.setConfigParms(configParams);

        return serverConfig;
    }
}
