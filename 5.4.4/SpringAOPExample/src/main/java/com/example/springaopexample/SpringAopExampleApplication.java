package com.example.springaopexample;

import com.example.springaopexample.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SpringAopExampleApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringAopExampleApplication.class, args);

        // Bean config using XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Bean config using Java-Based
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        LoanService loanService = (LoanService) context.getBean("loanService");
        System.out.println("\n");
        loanService.issueLoan("CUST-ASPECJ-01");
        loanService.clearDue("CUST-ASPECTJ-02");
    }

}
