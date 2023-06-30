package org.company.excludeautowire.config;

import org.company.excludeautowire.AnotherBean;
import org.company.excludeautowire.OneMoreBean;
import org.company.excludeautowire.SampleBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

    @Bean (autowireCandidate = false)
    public AnotherBean anotherBean() {
        return new AnotherBean("From Java Config");
    }

    @Bean
    public OneMoreBean oneMoreBean() {
        return new OneMoreBean("From Java Config");
    }

    @Bean
    public SampleBean sampleBean() {
        return new SampleBean();
    }

    @Bean
    public SampleBean sampleBean(AnotherBean anotherBean) {
        return new SampleBean(anotherBean);
    }

    @Bean
    public SampleBean sampleBean(OneMoreBean oneMoreBean) {
        return new SampleBean(oneMoreBean);
    }

    @Bean
    public SampleBean sampleBean(AnotherBean anotherBean, OneMoreBean oneMoreBean) {
        return new SampleBean(anotherBean, oneMoreBean);
    }
}
