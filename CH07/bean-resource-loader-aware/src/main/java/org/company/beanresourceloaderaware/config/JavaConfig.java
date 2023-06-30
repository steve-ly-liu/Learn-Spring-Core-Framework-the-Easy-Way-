package org.company.beanresourceloaderaware.config;

import org.company.beanresourceloaderaware.SampleBean;
import org.springframework.context.annotation.Bean;

public class JavaConfig {

    @Bean(name="ResourceLoaderAwareSampleBean")
    public SampleBean sampleBean() {return new SampleBean();}
}
