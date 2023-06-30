package org.company.springaopapi.config;

import org.company.springaopapi.LoanService;
import org.company.springaopapi.LogBeforeAndAfter;
import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public LoanService loanService() throws Exception {
        return new LoanService();
    }

    @Bean
    public LogBeforeAndAfter logBeforeAndAfter() throws Exception {
        return new LogBeforeAndAfter();
    }

    @Bean
    public ProxyFactoryBean loanServiceProxy() throws Exception {
        String[] interceptorNames = {"logBeforeAndAfter"};
        ProxyFactoryBean proxyFactoryBean = new ProxyFactoryBean();
        proxyFactoryBean.setTarget(loanService());
        proxyFactoryBean.setInterceptorNames(interceptorNames);
        return proxyFactoryBean;
    }
}
