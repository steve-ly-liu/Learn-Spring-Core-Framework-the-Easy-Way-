package org.company;

import java.util.Map;

public class ServerConfig {

	private Integer accountID;
	private String IP;
	private String Login;
	private String Password;
	private Map<String, String> configParms;

	public ServerConfig() {

	}

	public ServerConfig(Integer accountID, String iP, String login, String password) {
		super();
		System.out.println("ServerConfig : Constructor injection..");
		this.accountID = accountID;
		IP = iP;
		Login = login;
		Password = password;
	}

	public Map<String, String> getConfigParms() {
		return configParms;
	}

	public void setConfigParms(Map<String, String> configParms) {
		System.out.println("ServerConfig : Setter injection..");
		this.configParms = configParms;
	}

	@Override
	public String toString() {
		return "ServerConfig [accountID=" + accountID + ", IP=" + IP + ", Login=" + Login + ", Password=" + Password
				+ ", configParms=" + configParms + "]";
	}

	public void init() throws Exception {
		System.out.println("ServerConfig : Init called..");

	}

	public void destroy() throws Exception {
		System.out.println("ServerConfig : Destroy called..");

	}

}
