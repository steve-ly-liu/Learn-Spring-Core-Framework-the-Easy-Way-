package org.company.pointcutsamples.config;

import org.aspectj.lang.annotation.Before;
import org.company.pointcutsamples.CommonPointcuts;
import org.company.pointcutsamples.LoanService;
import org.company.pointcutsamples.LogBeforeAndAfter;
import org.company.pointcutsamples.TransactionAspect;
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
    public CommonPointcuts commonPointcuts() {
        return new CommonPointcuts();
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
