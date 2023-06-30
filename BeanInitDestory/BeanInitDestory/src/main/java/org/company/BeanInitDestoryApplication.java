package org.company;

import org.company.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanInitDestoryApplication  {

    public static void main(String[] args) {
        // Bean config using XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Bean config using Java
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        ServerConfig configObj = (ServerConfig) context.getBean("serverConfig");
        System.out.println(configObj);

        ((ConfigurableApplicationContext) context).close();


        //SpringApplication.run(BeanInitDestoryApplication.class, args);
    }

}
