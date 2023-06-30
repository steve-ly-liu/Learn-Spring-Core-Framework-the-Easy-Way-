package org.company.aspectjsample;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import java.lang.reflect.Method;
import java.util.Arrays;

@Aspect
public class LogBeforeAndAfter {
    @Before("execution(* LoanService.*(..))")
    public void before(JoinPoint jp) {
        System.out.println(this.getClass().getSimpleName() + " :===> Enter [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + Arrays.toString(jp.getArgs()) + ") method.");
    }

    @After("execution(* LoanService.*(..))")
    public void afterReturning(JoinPoint jp) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + " <===: Exit [" + jp.getClass().getSimpleName() +"]." + jp.getSignature().getName() + " method.");
    }
}
