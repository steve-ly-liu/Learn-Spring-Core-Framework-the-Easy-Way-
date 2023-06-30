package org.company.aspectjsample.config;


import org.company.aspectjsample.LoanService;
import org.company.aspectjsample.LogBeforeAndAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
    @Bean
    public LogBeforeAndAfter logBeforeAndAfter() throws Exception {
        return new LogBeforeAndAfter();
    }

    @Bean
    public LoanService loanService() throws Exception {
        return new LoanService();
    }
}
