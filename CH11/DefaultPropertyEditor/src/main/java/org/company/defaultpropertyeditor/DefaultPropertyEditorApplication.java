package org.company.defaultpropertyeditor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class DefaultPropertyEditorApplication {

    public static void main(String[] args) {
        // Bean Configuration using xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        SampleBean sampleBeanObj = (SampleBean) context.getBean("sampleBean");
        System.out.println("\n" + sampleBeanObj);

    }

}
