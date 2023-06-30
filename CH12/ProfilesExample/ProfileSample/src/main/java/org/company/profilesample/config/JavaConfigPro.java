package org.company.profilesample.config;

import org.company.profilesample.EnvironmentInterface;
import org.company.profilesample.JavaConfig;
import org.company.profilesample.ProductionEnv;
import org.company.profilesample.SampleEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile({"production", "default"})
@Configuration
public class JavaConfigPro implements JavaConfig {
    @Bean
    public EnvironmentInterface environmentInterface() {
        return new ProductionEnv();
    }

    @Bean
    public SampleEnvironment sampleEnvironment(EnvironmentInterface environmentInterface) {
        return new SampleEnvironment(environmentInterface);
    }
}
