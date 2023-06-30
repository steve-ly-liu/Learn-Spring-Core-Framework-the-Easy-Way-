package org.company.customeditor;

public class ServerInstance {
    private ServerConfig serverConfig;

    public ServerInstance(ServerConfig config) {
        this.serverConfig = config;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : [ serverConfig = " + serverConfig + " ]";
    }
}
