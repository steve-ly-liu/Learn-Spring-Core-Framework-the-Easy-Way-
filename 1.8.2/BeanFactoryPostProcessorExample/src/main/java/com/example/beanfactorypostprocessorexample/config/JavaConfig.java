package com.example.beanfactorypostprocessorexample.config;

import com.example.beanfactorypostprocessorexample.MimicBasicDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean()
    public MimicBasicDataSource basicDataSource() {
        return new MimicBasicDataSource();
    }
}
