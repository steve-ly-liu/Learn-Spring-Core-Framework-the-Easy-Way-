package com.example.ch3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Ch3Application {

	public static void main(String[] args) {

		//SpringApplication.run(Ch3Application.class, args);
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Config.xml");
		Bean obj = (Bean) applicationContext.getBean("beanObject");
		obj.shout();
	}

}
