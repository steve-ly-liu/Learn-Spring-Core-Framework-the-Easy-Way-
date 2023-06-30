package com.example.qualifiersamplesmethods;

import com.example.qualifiersamplesmethods.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class QualifierSamplesMethodsApplication {
    public static void main(String[] args) {
        SpringApplication.run(QualifierSamplesMethodsApplication.class, args);
        //Bean config using xml
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        //Bean config using Java
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        MovieRecommender recommender = (MovieRecommender) context.getBean("movieRecommender");
        recommender.displayAlLVideoInformation();
    }

}
