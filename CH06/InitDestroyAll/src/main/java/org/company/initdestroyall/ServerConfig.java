package org.company.initdestroyall;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Map;

public class ServerConfig implements InitializingBean, DisposableBean {
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
    public void afterPropertiesSet() {
        System.out.println(this.getClass().getSimpleName() + ".afterPropertiesSet() : InitializingBean Starting and connecting to the server ...");
    }

    @Override
    public void destroy() {
        System.out.println(this.getClass().getSimpleName() + ".destroy() : DisposableBean Shutting Down the server ...");
    }


    @PostConstruct
    public void postConstructMethod() {
        System.out.println(this.getClass().getSimpleName() + ".postConstructMethod() : @PostConstruct Starting and connecting to the server ...");
    }

    @PreDestroy
    public void preDestroyMethod() {
        System.out.println(this.getClass().getSimpleName() + ".preDestroyMethod() : @PreDestroy Shutting Down the server ...");
    }


    public void initCustomMethod() {
        System.out.println(this.getClass().getSimpleName() + ".initCustomMethod() : init-method Starting and connecting to the server ...");
    }

    public void destroyCustomMethod() {
        System.out.println(this.getClass().getSimpleName() + ".destroyCustomMethod() : destroy-method Shutting Down the server ...");
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
