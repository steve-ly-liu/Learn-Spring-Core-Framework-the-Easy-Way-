package org.company.beanappctxaware.config;

import org.company.beanappctxaware.AnotherBean;
import org.company.beanappctxaware.SampleBean;
import org.springframework.context.annotation.Bean;

public class JavaConfig {
    @Bean(name = "anotherBean")
    public AnotherBean anotherBean() { return new AnotherBean();}

    @Bean(name = "ApplicationContextAwareSampleBean")
    public SampleBean sampleBean() {
        return new SampleBean();
    }
}
