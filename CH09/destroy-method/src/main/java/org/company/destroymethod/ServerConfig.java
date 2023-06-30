package org.company.destroymethod;

import org.springframework.beans.factory.DisposableBean;

public class ServerConfig implements DisposableBean {
    private Server serverInstance;
    public ServerConfig(Server server){
        this.serverInstance = server;
    }


    public void init() throws Exception {
        System.out.println("ServerConfig : Init called ...");
    }

    public void destroy() throws Exception {
        System.out.println("ServerConfig : Destroy called ...");
        serverInstance.destroy();
    }

    public Server getServerInstance() {
        return serverInstance;
    }

}
