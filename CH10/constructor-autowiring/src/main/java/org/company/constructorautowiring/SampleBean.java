package org.company.constructorautowiring;

import org.springframework.beans.factory.annotation.Autowired;

public class SampleBean {
    @Autowired
    private AnotherBean anotherBean;
    @Autowired
    private OneMoreBean oneMoreBean;

    public SampleBean() {}

   /* public SampleBean(AnotherBean anotherBean) {
        this.anotherBean = anotherBean;
    }


    //@Autowired
    public SampleBean(AnotherBean anotherBean, OneMoreBean oneMoreBean) {
        this.anotherBean = anotherBean;
        this.oneMoreBean = oneMoreBean;
    }*/

    public void printSampleBeanMessage() {
        System.out.println("\n");
        System.out.println("SampleBean : the followings are the messages from dependencies beans.");
        anotherBean.printBeanMessage();
        oneMoreBean.printBeanMessage();
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
