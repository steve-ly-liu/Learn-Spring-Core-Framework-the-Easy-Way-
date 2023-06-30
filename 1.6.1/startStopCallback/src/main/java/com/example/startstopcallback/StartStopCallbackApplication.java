package com.example.startstopcallback;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class StartStopCallbackApplication {

    public static void main(String[] args) {
        SpringApplication.run(StartStopCallbackApplication.class, args);

        // Bean config using xml
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Bean config using Java based config
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        Server serverInstance = (Server) context.getBean("serverBean");
        System.out.println("\n---------------------------");
        serverInstance.start();
        System.out.println("===> : Is ServerInstance Running? " + serverInstance.isRunning());
        serverInstance.displayServerConfig();

        serverInstance.stop();
        System.out.println("===> : Is ServerInstance Running? " + serverInstance.isRunning());
        ((ConfigurableApplicationContext) context).close();
    }

}
