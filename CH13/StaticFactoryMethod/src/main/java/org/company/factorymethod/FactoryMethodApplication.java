package org.company.factorymethod;

import org.company.factorymethod.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class FactoryMethodApplication {

    public static void main(String[] args) {
        // Bean config using XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Ben config using Java
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        System.out.println("\n");
        ServerManager serverMgr = (ServerManager) context.getBean("serverManager");
        serverMgr.displayAccessMessage();

    }

}
