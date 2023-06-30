package com.example.xmluseconfigurationclass;

public class Server {
    private ServerConfig serverConfig;

    public Server(ServerConfig config) {
        this.serverConfig = config;
        System.out.println(this.getClass().getSimpleName() + " : New Server Instance ...");
    }

    public ServerConfig getServerConfig() {
        return serverConfig;
    }

    public void setServerConfig(ServerConfig serverConfig) {
        this.serverConfig = serverConfig;
    }

    public void displayServerConfig() {
        System.out.println(this.getClass().getSimpleName() + "displayServerConfig() : " + this.serverConfig.toString());
    }

}
