package org.company.siautowiring;

import org.company.siautowiring.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SiAutowiringApplication {

    public static void main(String[] args) {

        // Using XML bean configuration
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Using Java-based bean configuration
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
        sampleBean.printSampleBeanMessage();
    }

}
