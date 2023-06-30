package org.company.javaconfig;

import org.company.javaconfig.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class JavaConfigApplication {

    public static void main(String[] args) {

        // Using Java Based Bean Config
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        AnimalNoise animalNoise = (AnimalNoise) context.getBean("animalNoise");
        animalNoise.shout();
    }

}
