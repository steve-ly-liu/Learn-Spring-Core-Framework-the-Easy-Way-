package org.company.sampleattribute;

import org.company.sampleattribute.config.JavaConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class SampleAttributeApplication {

    public static void main(String[] args) {

        SpringApplication.run(SampleAttributeApplication.class, args);
        // Bean Config using xml
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

        // Bean config using Java Based
        //ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);

        LoanService loanService = (LoanService) context.getBean("loanService");
        System.out.println("\n----------------------------> LoanService.issueLoan(CUST-ISSUE-001) <-------------------");
        loanService.issueLoan("CUST-ISSUE-001");
        System.out.println("\n----------------------------> LoanService.clearDue(CUST-CLEAR-002) <-------------------");
        loanService.clearDue(""); //CUST-CLEAR-002
    }

}
