package org.company.springaopapi;

import org.company.springaopapi.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


@SpringBootApplication
public class SpringAopApiApplication {

    public static void main(String[] args) {

        // Bean config using XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Bean config using Java Based
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        LoanService loanService = (LoanService) context.getBean("loanServiceProxy");
        loanService.issueLoan("CUST-123");
        loanService.clearDue("CUST-56789");
    }

}
