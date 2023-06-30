package org.company;

import org.company.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {

		// Bean config using XML
	    // ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean config using Java
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);


		SampleBean obj = (SampleBean) context.getBean("sampleBean");
		
		obj.sampleMethod();
	}

}
