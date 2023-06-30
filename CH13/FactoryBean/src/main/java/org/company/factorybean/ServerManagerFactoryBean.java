package org.company.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class ServerManagerFactoryBean implements FactoryBean {
    private int apiKey;

    public ServerManagerFactoryBean(int apiKey) {
        this.apiKey = apiKey;
    }

    public Class<ServerManager> getObjectType() {
        return ServerManager.class;
    }

    public ServerManager getObject() throws Exception {
        if (isValidApiKey(this.apiKey)) {
            return new ServerManager(true);
        } else {
            return new ServerManager(false);
        }
    }

    private static boolean isValidApiKey(int apiKey) {
        if (apiKey == 123 )
            return true;
        else
            return false;
    }
}
