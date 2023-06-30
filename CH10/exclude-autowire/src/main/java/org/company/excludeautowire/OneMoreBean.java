package org.company.excludeautowire;

public class OneMoreBean {
    private String message;
    public OneMoreBean(String msg){
        message = msg;
    }
    public void printBeanMessage() {
        System.out.println("OneMoreBean : " + message);
    }
}
