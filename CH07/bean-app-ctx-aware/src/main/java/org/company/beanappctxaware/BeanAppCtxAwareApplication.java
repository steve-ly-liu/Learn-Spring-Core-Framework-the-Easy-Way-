package org.company.beanappctxaware;

import org.company.beanappctxaware.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanAppCtxAwareApplication {

    public static void main(String[] args) {

        // use XML config
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // use java annotation based config
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        SampleBean sampleBean = (SampleBean) context.getBean("ApplicationContextAwareSampleBean");
        sampleBean.sampleMethod();
    }

}
