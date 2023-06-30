package com.example.startstopcallback;

import org.springframework.context.LifecycleProcessor;
import java.util.Map;

public class ServerConfig implements LifecycleProcessor {
    private Integer accountID;
    private String ipAddress;
    private String loginName;
    private String password;
    private Map<String, String> configParams;

    public ServerConfig(Integer id, String ip, String userName, String pwd) {
        System.out.println(this.getClass().getSimpleName() + ".ServerConfig(" + id + ", " + ip + ", " + userName + ", " + pwd
                + ") : Constructor Injection ...");
        this.accountID = id;
        this.ipAddress = ip;
        this.loginName = userName;
        this.password = pwd;
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
        if (this.configParams != null) {
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

    public Map<String, String> getConfigParams() {
        return configParams;
    }
    public void setConfigParams(Map<String, String> configParams) {
        System.out.println(this.getClass().getSimpleName() + ".setConfigParams() : Setter Injection ...");
        this.configParams = configParams;
    }
    @Override
    public String toString() {
        return "ServerConfig [accountId=" + accountID + ", ipAddress=" + ipAddress + ", loginName=" + loginName
                + ", password=" + password + ", configParams=" + configParams + "]";
    }
}
