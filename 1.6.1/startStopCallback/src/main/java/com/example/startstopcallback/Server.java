package com.example.startstopcallback;

import org.springframework.context.LifecycleProcessor;

public class Server implements LifecycleProcessor {
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
    @Override
    public void start() {
        System.out.println(this.getClass().getSimpleName() + ".start() : start to Startup the Server Bean ...");
    }

    @Override
    public void stop() {
        System.out.println(this.getClass().getSimpleName() + ".stop() : start to Shutdown the Server Bean ...");
    }

    @Override
    public boolean isRunning() {
        boolean result = false;
        if (this.serverConfig != null) {
            result = true;
            System.out.println(this.getClass().getSimpleName() + ".isRunning() : the Server Bean is Running ...");
        } else
            System.out.println(this.getClass().getSimpleName() + ".isRunning() : the Server Bean IS NOT Running ...");
        return result;
    }

    @Override
    public void onRefresh() {
        System.out.println(this.getClass().getSimpleName() + ".onRefresh() : the Context has been Refreshed...");
    }

    public void onClose() {
        System.out.println(this.getClass().getSimpleName() + ".onRefresh() : the Context has been in Close Phase...");
    }
}
