package org.company.instancefactorymethod;

public class ServerManagerFactoryBean {
    public ServerManagerFactoryBean() {}

    public ServerManager createServerManagerInstance(int apiKey) {
        return new ServerManager(apiKey);
    }
}
