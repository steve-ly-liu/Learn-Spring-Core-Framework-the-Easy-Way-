package org.company.excludeautowire;

import org.springframework.beans.factory.annotation.Autowired;

public class SampleBean {

    private AnotherBean anotherBean;

    private OneMoreBean oneMoreBean;

    public SampleBean(){}

    public SampleBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public SampleBean(OneMoreBean oneMoreBean) {
        this.oneMoreBean = oneMoreBean;
    }

    public SampleBean(AnotherBean anotherBean, OneMoreBean oneMoreBean) {
        this.anotherBean = anotherBean;
        this.oneMoreBean = oneMoreBean;
    }

    public void printSampleBeanMessage() {
        System.out.println("\nSampleBean : The followings are messages from dependencies beans.");

        if (anotherBean != null) {
            anotherBean.printBeanMessage();
        }
        if (oneMoreBean != null) {
            oneMoreBean.printBeanMessage();
        }
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public void setAnotherBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }

    public OneMoreBean getOneMoreBean() {
        return oneMoreBean;
    }

    public void setOneMoreBean(OneMoreBean oneMoreBean) {
        this.oneMoreBean = oneMoreBean;
    }
}
