package org.company.orderofaspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Aspect
@Order(2)
public class LogBeforeAndAfter {
    public LogBeforeAndAfter() {}

    @Before("execution(* LoanService.*(..))")
    public void before(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> Enter [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }

    @AfterReturning("execution(* LoanService.*(..))")
    public void afterReturning(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> After Returning [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }

    @AfterThrowing("execution(* LoanService.*(..))")
    public void afterThrowing(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> After Throwing [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }

    @After("execution(* LoanService.*(..))")
    public void afterFinally(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> After Finally [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }

/*    @Around("execution(* LoanService.*(..))")
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
        }
    }*/
}
