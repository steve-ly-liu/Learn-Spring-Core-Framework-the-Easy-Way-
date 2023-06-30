package org.company;

import java.io.IOException;

import org.company.config.JavaConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

	public static void main(String[] args) throws IOException {

		// Bean config using XML
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		// Bean config using Java
		ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

		System.out.println("Hashcodes..");
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();
		new Thread(() -> System.out.println(((SampleBean) context.getBean("sampleBean")).hashCode())).start();

		System.out.println("Executing behaviour..");
		new Thread(() -> {

			SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
			sampleBean.setMessage("Message from T1");
			sampleBean.sampleMethod();

		}).start();

		new Thread(() -> {

			SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
			sampleBean.setMessage("Message from T2");
			sampleBean.sampleMethod();

		}).start();

		new Thread(() -> {

			SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
			sampleBean.setMessage("Message from T3");
			sampleBean.sampleMethod();

		}).start();

		new Thread(() -> {

			SampleBean sampleBean = (SampleBean) context.getBean("sampleBean");
			sampleBean.setMessage("Message from T4");
			sampleBean.sampleMethod();

		}).start();
	}

}
