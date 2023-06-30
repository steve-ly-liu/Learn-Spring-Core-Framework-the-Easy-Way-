package org.company.initdestroyall;

import org.company.initdestroyall.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class InitDestroyAllApplication {

	public static void main(String[] args) {
		//SpringApplication.run(InitDestroyAllApplication.class, args);
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
