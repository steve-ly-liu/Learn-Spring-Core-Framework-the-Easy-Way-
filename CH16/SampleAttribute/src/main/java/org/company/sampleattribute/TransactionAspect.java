package org.company.sampleattribute;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Aspect
@Order(1)
public class TransactionAspect {
    public TransactionAspect() {}

    @Around("execution(* LoanService.*(..))")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        try {
            System.out.println(this.getClass().getSimpleName() + " :===> Around Advice [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + "(" + Arrays.toString(pjp.getArgs())
                    + ") method :\n ------------- Begin Transaction -------------");
            pjp.proceed();
            System.out.println(this.getClass().getSimpleName() + " :===> Around Advice [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + "(" + Arrays.toString(pjp.getArgs())
                    + ") method :\n ------------- End Transaction -------------");
        } catch (Exception ex) {
            System.out.println(this.getClass().getSimpleName() + " :===> Around Advice [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + "(" + Arrays.toString(pjp.getArgs())
                    + ") method :\n &&&&&&&&&&&&&&& Rollback Transaction &&&&&&&&&&&&&&&");
            throw ex;
        }
    }
}
