package org.company.sampleadvices;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogBeforeAndAfter {
    @Before("execution(* LoanService.*(..))")
    public void before(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> Enter [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }

    /*@After("execution(* LoanService.*(..))")
    public void after(JoinPoint jp) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + " <===: After Exit [" + jp.getClass().getSimpleName() +"]." + jp.getSignature().getName() + " method.");
    }*/

    @AfterReturning("execution(* LoanService.*(..))")
    public void afterReturning(JoinPoint jp) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + " <===: After Returning [" + jp.getClass().getSimpleName() +"]." + jp.getSignature().getName() + " method.");
    }

    @AfterThrowing("execution(* LoanService.*(..))")
    public void afterThrowing(JoinPoint jp) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + " <===: After Throwing [" + jp.getClass().getSimpleName() +"]." + jp.getSignature().getName() + " method.");
    }
}