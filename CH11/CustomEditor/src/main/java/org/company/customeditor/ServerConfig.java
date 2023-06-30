package org.company.customeditor;

public class ServerConfig {
    private Integer accountId;
    private String IPAddress;
    private String loginName;
    private String password;

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + " : [ accountId = " + accountId + ", IPAddress = " + IPAddress
                + ", loginName = " + loginName + ", password = " + password + " ]";
    }

    public Integer getAccountId() {
        return accountId;
    }

    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    public String getIPAddress() {
        return IPAddress;
    }

    public void setIPAddress(String IPAddress) {
        this.IPAddress = IPAddress;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
