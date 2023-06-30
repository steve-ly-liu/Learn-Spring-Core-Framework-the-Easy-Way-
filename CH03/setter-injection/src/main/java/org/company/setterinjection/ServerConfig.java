package org.company.setterinjection;

public class ServerConfig {
    private Server serverInstance;

    public ServerConfig () {}


    public Server getServerInstance() {
        return serverInstance;
    }

    public void setServerInstance(Server serverInstance) {
        this.serverInstance = serverInstance;
    }

    public void printServerConfig() {
        System.out.println("ServerConfig : Server message is as the following ...");
        this.serverInstance.printServerMessage();
    }
}
