package org.company.sampleadvices;

import org.company.sampleadvices.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

@SpringBootApplication
public class SampleAdvicesApplication {

    public static void main(String[] args) {

        // Bean config using XML
        //ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Bean config using Java-Based
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        LoanService loanService = (LoanService) context.getBean("loanService");
        System.out.println("\n---------------------------- LoanService.issueLoan(Sample-CUST-01) -------------------");
        loanService.issueLoan("Sample-CUST-01");
        System.out.println("\n---------------------------- LoanService.clearDue(Sample-CUST-02) -------------------");
        loanService.clearDue("Sample-CUST-02");
    }

}
