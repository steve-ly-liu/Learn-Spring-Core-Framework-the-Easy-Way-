package org.company.beannameaware;

import org.company.config.JavaConfigBeanNameAware;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class BeanNameAwareApplication {

	public static void main(String[] args) {
		// Bean config using XML
		ApplicationContext context = new ClassPathXmlApplicationContext("config_beanNameAware.xml");
		SampleBean sampleBeanObj = (SampleBean) context.getBean("sampleBean_xml");

		//Bean config using Java
		//ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfigBeanNameAware.class);
		//SampleBean sampleBeanObj = (SampleBean) context.getBean("sampleBean_java");

		System.out.println("\n================= Bean Name Aware =================");
		sampleBeanObj.displayName();
		//SpringApplication.run(BeanNameAwareApplication.class, args);
	}

}
