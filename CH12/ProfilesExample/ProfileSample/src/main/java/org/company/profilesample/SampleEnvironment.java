package org.company.profilesample;

public class SampleEnvironment {
    private EnvironmentInterface env;

    public SampleEnvironment() {}

    public SampleEnvironment(EnvironmentInterface environmentInterface) {
        this.env = environmentInterface;
    }

    public void printSampleEnvironmentMessage() {
        System.out.println("\n");
        System.out.println(this.getClass().getSimpleName() + " : the environment message is as the below ...");
        env.printEnvironmentMessage();
    }

    public EnvironmentInterface getEnv() {
        return env;
    }

    public void setEnv(EnvironmentInterface env) {
        this.env = env;
    }
}
