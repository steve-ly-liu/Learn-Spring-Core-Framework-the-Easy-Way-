package org.company;

import java.beans.PropertyEditorSupport;
import java.util.Currency;

public class ServerConfigEditorx extends PropertyEditorSupport {
	
	private String secStr;
	
	public ServerConfigEditorx(String secStr) {
		super();
		this.secStr = secStr;
	}


	@Override
	public void setAsText(String str) throws IllegalArgumentException {
		String delimiter = "-";
		String[] array = str.split(delimiter);

		ServerConfig serverConfig = new ServerConfig();

		serverConfig.setAccountID(Integer.parseInt(array[0]));
		serverConfig.setIP(array[1]);
		serverConfig.setLogin(array[2]);
		serverConfig.setPassword(array[3]+secStr);

		setValue(serverConfig);
	}

	@Override
	public String getAsText() {

		return "SERVERDETAILSTOUI";
	}

}
