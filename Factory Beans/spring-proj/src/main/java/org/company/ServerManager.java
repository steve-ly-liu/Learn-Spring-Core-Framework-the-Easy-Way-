package org.company;

public class ServerManager {

	private static boolean restrictedAccess = false;

	public ServerManager(boolean restrictedAccess) {
		this.restrictedAccess = restrictedAccess;
	}

	public void displayMessage() {
		if (restrictedAccess)
			System.out.println("Restricted Access to ServerManager..");
		else
			System.out.println("Unlimited Access to ServerManager..");
	}
}
