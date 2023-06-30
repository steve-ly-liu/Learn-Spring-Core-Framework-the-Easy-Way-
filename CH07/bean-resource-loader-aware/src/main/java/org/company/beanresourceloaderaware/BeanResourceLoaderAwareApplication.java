package org.company.beanresourceloaderaware;

import org.company.beanresourceloaderaware.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

@SpringBootApplication
public class BeanResourceLoaderAwareApplication {

	public static void main(String[] args) throws IOException {
		// use XML-Based config file
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// use Java Code Annotation-based config file
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		SampleBean sampleBean = (SampleBean) context.getBean("ResourceLoaderAwareSampleBean");
		sampleBean.readResource();

		//SpringApplication.run(BeanResourceLoaderAwareApplication.class, args);
	}

}
