package org.company.initdestoryannotation;

import org.company.initdestoryannotation.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InitDestoryAnnotationApplication {

	public static void main(String[] args) {

		//SpringApplication.run(InitDestoryAnnotationApplication.class, args);

		// Bean config using xml
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		//Bean config using java
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
		System.out.println("\n-------------------");
		ServerConfig serverConfig = (ServerConfig) context.getBean("serverConfig");

		System.out.println(serverConfig);
		((ConfigurableApplicationContext) context).close();
	}
}
