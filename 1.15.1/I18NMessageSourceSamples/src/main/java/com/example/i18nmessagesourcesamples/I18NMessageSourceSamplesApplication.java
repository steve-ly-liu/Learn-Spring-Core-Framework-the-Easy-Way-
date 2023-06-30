package com.example.i18nmessagesourcesamples;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;
import java.util.Locale;

@SpringBootApplication
public class I18NMessageSourceSamplesApplication {

    public static void main(String[] args) {
        SpringApplication.run(I18NMessageSourceSamplesApplication.class, args);

        //Bean config using xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        I18NMessageSourceExample example = (I18NMessageSourceExample) context.getBean("i18NMessageSourceExample");
        System.out.println("\n Format CN Message: " + example.getLocalFormatMessage(Locale.CHINA));
        System.out.println("Format EN Message: " + example.getLocalFormatMessage(Locale.US));
        System.out.println("\n Exceptions CN Message: " + example.getLocalExceptionsMessage(Locale.CHINA));
        System.out.println("\n Exceptions EN Message: " + example.getLocalExceptionsMessage(Locale.US));

    }

}
