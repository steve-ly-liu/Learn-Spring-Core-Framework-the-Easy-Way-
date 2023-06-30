package com.example.springaopexample.config;

import com.example.springaopexample.AdviceMethods;
import com.example.springaopexample.CommonPointcuts;
import com.example.springaopexample.LoanService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class JavaConfig {
    @Bean
    public CommonPointcuts commonPointcuts() {
        return new CommonPointcuts();
    }

/*    @Bean
    public AdviceMethods adviceMethods() {
        return new AdviceMethods();
    }*/

    @Bean
    public LoanService loanService() {
        return new LoanService();
    }
}
