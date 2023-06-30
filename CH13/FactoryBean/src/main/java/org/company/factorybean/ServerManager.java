package org.company.factorybean;

public class ServerManager {
    private boolean isValidAccess;

    public ServerManager(boolean validFlag) {
        this.isValidAccess = validFlag;
    }

    public void displayAccessMessage() {
        if (isValidAccess)
            System.out.println(this.getClass().getSimpleName() + " : Unlimited Access to ServerManager ...");
        else
            System.out.println(this.getClass().getSimpleName() + " : Restrict Access to ServerManager ...");
    }

}
