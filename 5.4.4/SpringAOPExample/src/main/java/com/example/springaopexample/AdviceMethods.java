package com.example.springaopexample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceMethods {

    @Before("com.example.springaopexample.CommonPointcuts.loanServicePointcut()")
    //@Before("execution(* com.example.springaopexample.LoanService.*(..))")
    public void beforeLoan(JoinPoint jp) {
        System.out.println("Before Loan ...");
    }

    @AfterReturning("com.example.springaopexample.CommonPointcuts.loanServicePointcut()")
    public void afterReturningLoan(JoinPoint jp) {
        System.out.println("After Return Loan ...");
    }

    @AfterThrowing("com.example.springaopexample.CommonPointcuts.loanServicePointcut()")
    public void afterThrowingLoan(JoinPoint jp) {
        System.out.println("After Throwing Loan ...");
    }

    @After("com.example.springaopexample.CommonPointcuts.loanServicePointcut()")
    public void afterFinallyLoan(JoinPoint jp) {
        System.out.println("After Finally Loan ...");
    }

    @Around("com.example.springaopexample.CommonPointcuts.loanServicePointcut()")
    public void aroundLoan(ProceedingJoinPoint pjp) throws Throwable {
        try {
            System.out.println(this.getClass().getSimpleName() + " ---> Around : [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + ": Begin Loan Check ...");
            pjp.proceed();
            System.out.println(this.getClass().getSimpleName() + " ---> Around : [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + ": END Loan Check ...");
        } catch (Throwable e) {
            System.out.println(this.getClass().getSimpleName() + " ---> Around : [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + ": Rollback Loan ...");
            throw e;
        }
    }
}
