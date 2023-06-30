package org.company.constructorautowiring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ConstructorAutowiringApplication {

    public static void main(String[] args) {

        // using xml based bean configuration
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
        sampleBean.printSampleBeanMessage();
    }

}
