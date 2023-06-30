package com.example.beanfactorypostprocessorexample;

public class MimicBasicDataSource {
    private String driverClassName;
    private String url;
    private String userName;
    private String password;

    public MimicBasicDataSource() {}

    public void init() {
        System.out.println("The DB connection to [" + this.url + "] is establishing ...");
    }
    public void close() {
        System.out.println("The DB connection to [" + this.url + "] is closed ...");
    }
    @Override
    public String toString() {
        return "JdbcDataSource [driverClassName=" + this.driverClassName + ", url=" + this.url
                + ", userName=" + userName + ", password=" + this.password + "]";
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
