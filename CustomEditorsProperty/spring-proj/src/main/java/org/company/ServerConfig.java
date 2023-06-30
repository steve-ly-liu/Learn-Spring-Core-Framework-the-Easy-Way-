package org.company;

public class ServerConfig {

	private Integer accountID;
	private String IP;
	private String Login;
	private String Password;
	
	public Integer getAccountID() {
		return accountID;
	}
	public void setAccountID(Integer accountID) {
		this.accountID = accountID;
	}
	public String getIP() {
		return IP;
	}
	public void setIP(String iP) {
		IP = iP;
	}
	public String getLogin() {
		return Login;
	}
	public void setLogin(String login) {
		Login = login;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "ServerConfig [accountID=" + accountID + ", IP=" + IP + ", Login=" + Login + ", Password=" + Password
				+ "]";
	}
		
}
