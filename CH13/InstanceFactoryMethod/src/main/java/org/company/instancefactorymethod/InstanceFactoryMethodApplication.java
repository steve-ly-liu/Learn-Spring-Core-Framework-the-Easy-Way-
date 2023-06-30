package org.company.instancefactorymethod;

import org.company.instancefactorymethod.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class InstanceFactoryMethodApplication {

	public static void main(String[] args) {

		// Bean config using xml
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean config using Java based
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		ServerManager svrMgr = (ServerManager) context.getBean("serverManager");
		System.out.println("\n");
		svrMgr.displayValidAccessMessage();
	}

}
