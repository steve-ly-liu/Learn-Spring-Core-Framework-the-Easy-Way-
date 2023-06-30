package org.company.profilesample.config;

import org.company.profilesample.DevelopmentEnv;
import org.company.profilesample.EnvironmentInterface;
import org.company.profilesample.JavaConfig;
import org.company.profilesample.SampleEnvironment;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Profile("development")
@Configuration
public class JavaConfigDev implements JavaConfig {
    @Bean
    public EnvironmentInterface environmentInterface() {
        return new DevelopmentEnv();
    }
    @Bean
    public SampleEnvironment sampleEnvironment(EnvironmentInterface environmentInterface) {
        return new SampleEnvironment(environmentInterface);
    }
}
