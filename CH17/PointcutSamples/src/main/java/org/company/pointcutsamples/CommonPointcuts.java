package org.company.pointcutsamples;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class CommonPointcuts {
    @Pointcut("execution(* LoanService.*(..))")
    public void allMethodsInLoanService() {}

    @Pointcut("execution(* LoanService.*(..)) && args(customerId, ..)")
    public void allMethodsWithStringArgumentInLoanService(String customerId) {}
}
