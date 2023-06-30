package org.company.profilesample;

public class ProductionEnv implements EnvironmentInterface {
    public ProductionEnv() {}

    public void printEnvironmentMessage() {
        System.out.println(this.getClass().getSimpleName() + " : You are in Production Environment...");
    }
}
