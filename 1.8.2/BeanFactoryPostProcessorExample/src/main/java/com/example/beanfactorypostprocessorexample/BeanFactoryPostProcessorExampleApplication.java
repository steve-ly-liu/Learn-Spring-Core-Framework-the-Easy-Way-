package com.example.beanfactorypostprocessorexample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanFactoryPostProcessorExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(BeanFactoryPostProcessorExampleApplication.class, args);

        // Bean config using xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        MimicBasicDataSource dbDS = (MimicBasicDataSource) context.getBean("basicDataSource");
        System.out.println("\n----------------------------------");
        System.out.println("JDBC: " + dbDS.toString());
    }

}
