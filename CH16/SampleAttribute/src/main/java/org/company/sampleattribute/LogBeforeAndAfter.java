package org.company.sampleattribute;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;

import java.util.Arrays;

@Aspect
@Order(2)
public class LogBeforeAndAfter {
    @Before("execution(* LoanService.*(..))")
    public void before(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> Before [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }

    @AfterReturning(pointcut = "execution(* LoanService.*(..))", returning = "returnValue")
    public void afterReturning(JoinPoint jp, Boolean returnValue) {
        System.out.println(this.getClass().getSimpleName() + " :===> After Returning ["
                + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName()
                + "(" + Arrays.toString(jp.getArgs()) + ") method: Return Value [" + returnValue + "].");
    }

    @AfterThrowing(pointcut = "execution(* LoanService.*(..))", throwing = "ex")
    public void afterThrowing(JoinPoint jp, Exception ex) {
        System.out.println(this.getClass().getSimpleName() + " :===> After Throwing ["
                + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName()
                + "(" + Arrays.toString(jp.getArgs()) + ") method: Exception is [" + ex + "].");
    }

    @After("execution(* LoanService.*(..))")
    public void afterFinally(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> After Finally [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }
}
