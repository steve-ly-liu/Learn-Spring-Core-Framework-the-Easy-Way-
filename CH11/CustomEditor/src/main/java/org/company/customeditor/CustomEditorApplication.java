package org.company.customeditor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class CustomEditorApplication {

	public static void main(String[] args) {

		// Bean Configuration using XML
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		ServerInstance serverInstance = (ServerInstance) context.getBean("serverInstance");
		System.out.println(serverInstance);
	}

}
