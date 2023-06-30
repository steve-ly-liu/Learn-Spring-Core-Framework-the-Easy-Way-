package com.example.genericautowirequalifier;

import com.example.genericautowirequalifier.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class GenericAutowireQualifierApplication {

    public static void main(String[] args) {
        SpringApplication.run(GenericAutowireQualifierApplication.class, args);
        //Bean config using xml
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        //Bean config using Java
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        StoreManager storeManager = (StoreManager) context.getBean("storeManager");
        storeManager.displayStores();
    }

}
