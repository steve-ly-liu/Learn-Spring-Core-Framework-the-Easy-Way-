package org.company.constructorautowiring.config;

import org.company.constructorautowiring.AnotherBean;
import org.company.constructorautowiring.OneMoreBean;
import org.company.constructorautowiring.SampleBean;
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
