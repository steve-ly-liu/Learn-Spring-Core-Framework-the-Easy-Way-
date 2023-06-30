package org.company.beannameaware;

import org.springframework.beans.factory.BeanNameAware;

public class SampleBean implements BeanNameAware {
    private String beanName;

    public SampleBean() {}

    @Override
    public void setBeanName(String bName) {
        this.beanName = bName;
    }
    public void displayName() {
        System.out.println(beanName);
    }
}
