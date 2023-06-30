package org.company.siautowiring.config;

import org.company.siautowiring.AnotherBean;
import org.company.siautowiring.OneMoreBean;
import org.company.siautowiring.SampleBean;
import org.springframework.beans.factory.annotation.Autowire;
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

    @Bean(autowire = Autowire.BY_NAME)
    public SampleBean sampleBean() {
        return new SampleBean();
    }
}
