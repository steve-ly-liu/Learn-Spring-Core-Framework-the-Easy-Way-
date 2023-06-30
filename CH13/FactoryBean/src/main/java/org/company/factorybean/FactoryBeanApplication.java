package org.company.factorybean;

import org.company.factorybean.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.swing.*;

@SpringBootApplication
public class FactoryBeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(FactoryBeanApplication.class, args);
		// Bean config using XML
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean config using Java based
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		ServerManager svrMgr = (ServerManager) context.getBean("serverManager");
		System.out.println("\n");
		svrMgr.displayAccessMessage();

	}

}
