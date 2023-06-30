package org.company.profilesample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class ProfileSampleApplication {

    public static void main(String[] args) {

        // Bean definition using XML -- Multiple config-*.xml
        /*GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("config-*.xml");
        context.refresh();*/

        // Bean definition using XML -- single config.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Bean definition using Java config
        /*AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("org.company.profilesample");
        context.refresh();*/

        SampleEnvironment sampleEnv = (SampleEnvironment) context.getBean("sampleEnvironment");
        sampleEnv.printSampleEnvironmentMessage();
    }

}
