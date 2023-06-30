package com.example.qualifiersamplescustomsinglevalue;

import com.example.qualifiersamplescustomsinglevalue.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class QualifierSamplesCustomSingleValueApplication {
    public static void main(String[] args) {
        SpringApplication.run(QualifierSamplesCustomSingleValueApplication.class, args);
        //Bean config using xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Bean config using Java
        //ApplicationContext context1 = new AnnotationConfigApplicationContext(JavaConfig.class);

        MovieRecommender recommender = (MovieRecommender) context.getBean("movieRecommender");
        recommender.displayAlLVideoInformation();
    }

}
