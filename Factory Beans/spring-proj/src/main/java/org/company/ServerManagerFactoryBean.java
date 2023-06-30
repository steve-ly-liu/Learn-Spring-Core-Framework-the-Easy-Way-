package org.company;

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

		if (isApliKeyValid(apiKey)) {
			return new ServerManager(false);
		} else {
			return new ServerManager(true);
		}

	}

	private static boolean isApliKeyValid(int apiKey) {

		if (apiKey == 123) {

			return true;
		} else if (apiKey == 321) {

			return false;
		} else {
			return false;
		}
	}

}
