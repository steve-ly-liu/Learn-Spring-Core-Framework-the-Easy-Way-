package org.company;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Bean config using XML
		 GenericXmlApplicationContext context = new GenericXmlApplicationContext("config.xml");

		// Bean config using Java
		//AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		ServerManager sampelBean = (ServerManager) context.getBean("serverManager");
		sampelBean.displayMessage();
		context.close();

	}

}
