package org.company;

public class Example {

	private ServerConfig serverConfig;

	public Example(ServerConfig serverConfig) {
		super();
		this.serverConfig = serverConfig;
	}

	@Override
	public String toString() {
		return "Example [serverConfig=" + serverConfig + "]";
	}

}
