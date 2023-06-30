package com.example.lookupmethodinjectionexample;

import com.example.lookupmethodinjectionexample.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class LookupMethodInjectionExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(LookupMethodInjectionExampleApplication.class, args);
        //Bean config using xml
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //Bean config using Java
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        System.out.println("CommandManager 1 : " + (CommandManager) context.getBean(CommandManager.class));
        System.out.println("CommandManager 2 : " + (CommandManager) context.getBean(CommandManager.class));
        System.out.println("CommandManager 3 : " + (CommandManager) context.getBean(CommandManager.class));
    }
}
