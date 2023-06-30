package org.company;

public class ServerManager {

	private static boolean restrictedAccess = false;

	private ServerManager() {
	}

	public static ServerManager getInstance(int apiKey) {
		if (isApliKeyValid(apiKey)) {
			return new ServerManager();
		} else {

			ServerManager serverManager = new ServerManager();
			serverManager.restrictedAccess = true;
			return serverManager;
		}

	}

	private static boolean isApliKeyValid(int apiKey) {
		return false;
	}

	public void displayMessage() {
		if (restrictedAccess)
			System.out.println("Restricted Access to ServerManager..");
		else
			System.out.println("Unlimited Access to ServerManager..");
	}
}
