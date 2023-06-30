package org.company.destroymethod;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DestroyMethodApplication {

    public static void main(String[] args) {
        // Bean config using XML
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Bean config using Java
        //ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        System.out.println("\nUsing beans in application ...");
        ServerConfig obj = (ServerConfig) context.getBean("serverConfig");

        System.out.println("Closing context ...");
        ((ConfigurableApplicationContext) context).close();

    }

}
