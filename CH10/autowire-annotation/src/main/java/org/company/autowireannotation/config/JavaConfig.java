package org.company.autowireannotation.config;

import org.company.autowireannotation.AnotherBean;
import org.company.autowireannotation.OneMoreBean;
import org.company.autowireannotation.SampleBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public AnotherBean anotherBean() {
        return new AnotherBean();
    }

    @Bean
    public OneMoreBean oneMoreBean() {
        return new OneMoreBean();
    }

    @Bean
    public SampleBean sampleBean() {
        return new SampleBean();
    }
}
