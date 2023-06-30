package org.company.siautowiring;

public class SampleBean {
    private AnotherBean anotherBean;
    private OneMoreBean oneMoreBean;

    public SampleBean() {}

    public void printSampleBeanMessage() {
        System.out.println("\n");
        System.out.println("SampleBean : will print dependency beans' message ...");
        anotherBean.printBeanMessage();
        oneMoreBean.printBeanMessage();
    }

    public AnotherBean getAnotherBean() {
        return anotherBean;
    }

    public OneMoreBean getOneMoreBean() {
        return oneMoreBean;
    }

    public void setAnotherBean(AnotherBean aBean) {
        this.anotherBean = aBean;
    }

    public void setOneMoreBean(OneMoreBean oBean) {
        this.oneMoreBean = oBean;
    }
}
