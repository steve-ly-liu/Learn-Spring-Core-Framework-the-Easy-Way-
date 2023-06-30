package org.company.config;

import org.company.beannameaware.SampleBean;
import org.springframework.context.annotation.Bean;

public class JavaConfigBeanNameAware {
    @Bean(name = "sampleBean_java")
    public SampleBean sampleBean() {
        return new SampleBean();
    }
}
