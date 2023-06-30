package org.company.destroymethod;

import org.springframework.beans.factory.DisposableBean;

public class Server implements DisposableBean {


    public Server() {}

    public void init() throws Exception {
        System.out.println("Server : Init called ...");
    }

    public void destroy() throws Exception {
        System.out.println("Server : Destroy called ...");
    }
}
