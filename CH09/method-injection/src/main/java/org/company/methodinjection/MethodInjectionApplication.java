package org.company.methodinjection;

import org.company.methodinjection.config.JavaConfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MethodInjectionApplication {

	public static void main(String[] args) {
		// Bean config using xml
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean Config using Java
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		System.out.println("Using beans in application ...");
		ServerConfig configObj = (ServerConfig) context.getBean("serverConfig");

		System.out.println("\n===================================");
		System.out.println(configObj.getNewServer().hashCode());
		System.out.println(configObj.getNewServer().hashCode());
		System.out.println(configObj.getNewServer().hashCode());
		System.out.println("===================================");

		System.out.println("Closing context ...");
		((ConfigurableApplicationContext) context).close();
		System.out.println("\n");

	}

}
