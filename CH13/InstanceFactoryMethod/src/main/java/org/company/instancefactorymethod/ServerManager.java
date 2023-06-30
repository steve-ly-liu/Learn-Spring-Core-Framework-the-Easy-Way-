package org.company.instancefactorymethod;

public class ServerManager {
    private boolean isValidAccess;

    public ServerManager(int apiKey) {
        this.isValidAccess = checkIsValidKey(apiKey);
    }

    public void displayValidAccessMessage() {
        if (isValidAccess)
            System.out.println(this.getClass().getSimpleName() + " : Unlimited to access the server.");
        else
            System.out.println(this.getClass().getSimpleName() + " : Restrict to access the server.");
    }

    private boolean checkIsValidKey(int apiKey) {
        if (apiKey == 123)
            return true;
        else
            return false;
    }

    public boolean isValidAccess() {
        return isValidAccess;
    }

    public void setValidAccess(boolean validAccess) {
        isValidAccess = validAccess;
    }
}
