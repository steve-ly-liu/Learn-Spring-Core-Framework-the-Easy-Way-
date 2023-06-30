package org.company.orderofaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;

@Aspect
@Order(1)
public class TransactionAspect {
    public TransactionAspect() {}

    @Around("execution(* LoanService.*(..))")
    public void aroundAdvice(ProceedingJoinPoint pjp) throws Throwable {
        try {
            System.out.println(this.getClass().getSimpleName() + " ---> Around : [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + ": Begin Transaction ...");
            pjp.proceed();
            System.out.println(this.getClass().getSimpleName() + " ---> Around : [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + ": END Transaction ...");
        } catch (Throwable e) {
            System.out.println(this.getClass().getSimpleName() + " ---> Around : [" + pjp.getClass().getSimpleName() + "]."
                    + pjp.getSignature().getName() + ": Rollback Transaction ...");
            throw e;
        }

    }
}
