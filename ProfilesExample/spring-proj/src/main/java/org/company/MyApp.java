package org.company;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) {
		// Bean config using XML
       /* GenericXmlApplicationContext context = new GenericXmlApplicationContext();
        context.load("config-*.xml");
        context.refresh();*/
        
		// Bean config using Java
        AnnotationConfigApplicationContext  context = new AnnotationConfigApplicationContext();
        context.scan("org.company"); 
        context.refresh();
       
        DBManager dbManager = (DBManager) context.getBean("dbManager");
        dbManager.connectToDB();
        context.close();
	
	}

}
