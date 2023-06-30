package com.example.springaopexample;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

public class CommonPointcuts {
    @Pointcut("execution(* com.example.springaopexample.LoanService.*(..))")
    public void loanServicePointcut() {
        System.out.println("===> Loan Service Pointcut ... ... \n");
    }

}
