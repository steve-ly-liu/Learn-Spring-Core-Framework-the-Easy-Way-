package org.company.pointcutsamples;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class TransactionAspect {

    @Around("org.company.pointcutsamples.CommonPointcuts.allMethodsWithStringArgumentInLoanService(customerId)")
    public void aroundAdvice(ProceedingJoinPoint pjp, String customerId) throws Throwable {
        try {
            System.out.println(this.getClass().getSimpleName() + " Around Advice :===> [" + pjp.getClass().getSimpleName() + "]." + pjp.getSignature().getName() + "(" + customerId + ") method.");
            System.out.println("-----------> Begin transaction ...");
            pjp.proceed();
            System.out.println("-----------> Commit transaction ...");
        } catch (Exception ex) {
            System.out.println("&&&&&&&&&&&&& Rollback transaction ...");
            throw ex;
        }
    }
}
