package org.company.autowireannotation;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.RecursiveTask;

public class SampleBean {
    @Autowired
    private AnotherBean anotherBean;

    @Autowired
    private OneMoreBean oneMoreBean;

    public SampleBean() {}

    public void printSampleBeanMessage() {
        System.out.println("\n");
        System.out.println("SampleBean : the followings are the messages from dependencies beans.");
        anotherBean.printBeanMessage();
        oneMoreBean.printBeanMessage();
    }

    public AnotherBean getAnotherBean() {
        return this.anotherBean;
    }

    public void setAnotherBean(AnotherBean aBean) {
        this.anotherBean = aBean;
    }

    public OneMoreBean getOneMoreBean() {
        return this.oneMoreBean;
    }

    public void setOneMoreBean(OneMoreBean oBean) {
        this.oneMoreBean = oBean;
    }
}
