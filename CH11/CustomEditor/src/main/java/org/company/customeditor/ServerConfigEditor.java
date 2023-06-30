package org.company.customeditor;

import java.beans.PropertyEditorSupport;

public class ServerConfigEditor extends PropertyEditorSupport {
    @Override
    public void setAsText(String str) throws IllegalArgumentException {
        String delimiter = "-";
        String[] arrary = str.split(delimiter);

        ServerConfig serverConfig = new ServerConfig();
        serverConfig.setAccountId(Integer.parseInt(arrary[0]));
        serverConfig.setIPAddress(arrary[1]);
        serverConfig.setLoginName(arrary[2]);
        serverConfig.setPassword(arrary[3]);

        setValue(serverConfig);
    }

    @Override
    public String getAsText() {
        return "SERVERDETAILSTOUT";
    }

}
