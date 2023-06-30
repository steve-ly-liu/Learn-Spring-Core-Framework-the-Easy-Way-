package org.company.factorymethod;

public class ServerManager {
    private boolean isValidAccess;
    private ServerManager() {
        this.isValidAccess = false;
    }

    public static ServerManager getServerManagerInstance(int apiKey) {
        if (isValidApiKey(apiKey)) {
            ServerManager svrMgr = new ServerManager();
            svrMgr.isValidAccess = true;
            return svrMgr;
        } else
            return new ServerManager();
    }

    private static boolean isValidApiKey(int apiKey) {
        if (apiKey == 123 )
            return true;
        else
            return false;
    }

    public void displayAccessMessage() {
        if (isValidAccess)
            System.out.println(this.getClass().getSimpleName() + " : Unlimited Access to ServerManager ...");
        else
            System.out.println(this.getClass().getSimpleName() + " : Restrict Access to ServerManager ...");
    }

    public boolean isValidAccess() {
        return isValidAccess;
    }

    public void setValidAccess(boolean validAccess) {
        isValidAccess = validAccess;
    }
}
