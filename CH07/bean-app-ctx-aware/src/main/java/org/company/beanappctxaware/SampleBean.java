package org.company.beanappctxaware;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SampleBean implements ApplicationContextAware {
    private ApplicationContext applicationContext;

    public SampleBean() {}

    public void setApplicationContext(ApplicationContext ctx) throws BeansException {
        this.applicationContext = ctx;
    }

    public void sampleMethod() {
        AnotherBean anotherBean = (AnotherBean) this.applicationContext.getBean("anotherBean");
        anotherBean.displayMessage();
        System.out.println(this.applicationContext.getClassLoader());
        System.out.println(this.applicationContext.getEnvironment());
    }
}
