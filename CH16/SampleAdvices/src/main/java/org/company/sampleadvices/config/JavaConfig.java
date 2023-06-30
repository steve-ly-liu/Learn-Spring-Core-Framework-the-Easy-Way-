package org.company.sampleadvices.config;

import org.aspectj.lang.annotation.Before;
import org.company.sampleadvices.LoanService;
import org.company.sampleadvices.LogBeforeAndAfter;
import org.company.sampleadvices.TransactionAspect;
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
