package org.company.excludeautowire;

public class AnotherBean {
    private String message;
    public AnotherBean(String msg) {
        this.message = msg;
    }

    public void printBeanMessage() {

        System.out.println("AnotherBean : " + message);
    }
}
