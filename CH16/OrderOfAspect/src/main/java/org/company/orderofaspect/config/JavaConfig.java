package org.company.orderofaspect.config;

import org.company.orderofaspect.LoanService;
import org.company.orderofaspect.LogBeforeAndAfter;
import org.company.orderofaspect.TransactionAspect;
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
