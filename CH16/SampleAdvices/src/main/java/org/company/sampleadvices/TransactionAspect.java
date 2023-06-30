package org.company.sampleadvices;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class TransactionAspect {
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
