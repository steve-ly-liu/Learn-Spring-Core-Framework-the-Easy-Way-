package org.company.orderofaspect;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class OrderOfAspectApplication {

	public static void main(String[] args) {

		// Bean config using XML
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");

		LoanService loanService = (LoanService) context.getBean("loanService");
		System.out.println("\n---------------------------- LoanService.issueLoan(CUST-ISSUE-001) -------------------");
		loanService.issueLoan("CUST-ISSUE-001");
		System.out.println("\n---------------------------- LoanService.clearDue(CUST-CLEAR-002) -------------------");
		loanService.clearDue("CUST-CLEAR-002");
	}

}
