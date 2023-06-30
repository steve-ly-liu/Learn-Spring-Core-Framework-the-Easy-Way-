package org.company.profilesample;

public class DevelopmentEnv implements EnvironmentInterface {
    public DevelopmentEnv() {}
    public void printEnvironmentMessage() {
        System.out.println(this.getClass().getSimpleName() + " : You are in Development Environment...");
    }
}
