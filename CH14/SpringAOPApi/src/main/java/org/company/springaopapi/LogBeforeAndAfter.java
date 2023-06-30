package org.company.springaopapi;

import org.springframework.aop.AfterReturningAdvice;
import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;
import java.util.Arrays;

public class LogBeforeAndAfter implements MethodBeforeAdvice, AfterReturningAdvice {
    public void before(Method method,Object[] args, Object targetObj) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + " :===> Enter [" + targetObj.getClass().getSimpleName() + "]." + method.getName() + "(" + Arrays.toString(args) + ") method.");
    }

    public void afterReturning(Object returnValue, Method method, Object[] args, Object targetObj) throws Throwable {
        System.out.println(this.getClass().getSimpleName() + " <===: Exit [" + targetObj.getClass().getSimpleName() +"]." + method.getName() + " method.");
    }
}
