package org.company.pointcutsamples;

import org.company.pointcutsamples.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.beans.JavaBean;

@SpringBootApplication
public class PointcutSamplesApplication {

    public static void main(String[] args) {

        SpringApplication.run(PointcutSamplesApplication.class, args);

        // Bean config using xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Bean config using Java
        //ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        LoanService loanService = (LoanService) context.getBean("loanService");
        System.out.println("\n");
        System.out.println("\n----------------------------> LoanService.issueLoan(CUST-ISSUE-001) <-------------------");
        loanService.issueLoan("CUST-ISSUE-001");
        System.out.println("\n----------------------------> LoanService.clearDue(CUST-CLEAR-002) <-------------------");
        loanService.clearDue(""); //CUST-CLEAR-002
    }

}
