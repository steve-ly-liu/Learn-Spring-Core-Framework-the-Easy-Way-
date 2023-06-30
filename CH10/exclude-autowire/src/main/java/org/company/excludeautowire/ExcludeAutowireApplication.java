package org.company.excludeautowire;

import org.company.excludeautowire.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class ExcludeAutowireApplication {

	public static void main(String[] args) {

		// Using XML Based Bean config
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Using Java Based Bean config
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
		sampleBean.printSampleBeanMessage();
	}

}
