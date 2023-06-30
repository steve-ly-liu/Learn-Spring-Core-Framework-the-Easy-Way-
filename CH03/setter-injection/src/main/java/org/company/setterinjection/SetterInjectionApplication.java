package org.company.setterinjection;

import org.company.setterinjection.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SetterInjectionApplication {

	public static void main(String[] args) {
		// Bean config using XML
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean config using Java
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		System.out.println("================================");
		System.out.println("Using Beans in Application ...");
		ServerConfig serverConfig = (ServerConfig) context.getBean("serverConfig");
		serverConfig.printServerConfig();

		System.out.println("================================");
	}

}
