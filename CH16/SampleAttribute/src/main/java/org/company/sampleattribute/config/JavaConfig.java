package org.company.sampleattribute.config;

import org.company.sampleattribute.LoanService;
import org.company.sampleattribute.LogBeforeAndAfter;
import org.company.sampleattribute.TransactionAspect;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
    @Bean
    public LoanService loanService() {
        return new LoanService();
    }

    @Bean
    public LogBeforeAndAfter logBeforeAndAfter() {
        return new LogBeforeAndAfter();
    }

    @Bean
    public TransactionAspect transactionAspect() {
        return new TransactionAspect();
    }
}
