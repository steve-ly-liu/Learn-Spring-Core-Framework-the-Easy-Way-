package org.company.autowireannotation;

import org.company.autowireannotation.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class AutowireAnnotationApplication {

    public static void main(String[] args) {

        // Using XML-Based bean configuration
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Using Java-Based bean configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
        sampleBean.printSampleBeanMessage();
    }

}
