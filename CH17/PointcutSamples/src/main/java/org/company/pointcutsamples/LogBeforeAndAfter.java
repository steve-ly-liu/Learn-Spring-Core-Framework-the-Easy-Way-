package org.company.pointcutsamples;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

@Aspect
public class LogBeforeAndAfter {
    public LogBeforeAndAfter() {}

    @Before("org.company.pointcutsamples.CommonPointcuts.allMethodsWithStringArgumentInLoanService(customerId)")
    public void before(JoinPoint jp, String customerId) {
        System.out.println(this.getClass().getSimpleName() + " Before Advice :===> [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + customerId + ") method.");
    }

    @AfterReturning(pointcut = "org.company.pointcutsamples.CommonPointcuts.allMethodsWithStringArgumentInLoanService(customerId))", returning = "returnValue")
    public void afterReturning(JoinPoint jp, String customerId, Boolean returnValue) {
        System.out.println(this.getClass().getSimpleName() + " After Returning Advice :===> [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + customerId + ") method = ( " + returnValue + " ).");
    }

    @AfterThrowing(pointcut = "org.company.pointcutsamples.CommonPointcuts.allMethodsWithStringArgumentInLoanService(customerId)", throwing = "ex")
    public void afterThrowing(JoinPoint jp, String customerId, Exception ex) {
        System.out.println(this.getClass().getSimpleName() + " After Throwing Advice :===> ["
                + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "("
                + customerId + ") method : Exception is : ["
                + ex + "]");
    }

    @After("org.company.pointcutsamples.CommonPointcuts.allMethodsWithStringArgumentInLoanService(customerId)")
    public void afterFinally(JoinPoint jp, String customerId) {
        System.out.println(this.getClass().getSimpleName() + " Before Advice :===> [" + jp.getClass().getSimpleName() + "]." + jp.getSignature().getName() + "(" + customerId + ") method.");
    }
}
