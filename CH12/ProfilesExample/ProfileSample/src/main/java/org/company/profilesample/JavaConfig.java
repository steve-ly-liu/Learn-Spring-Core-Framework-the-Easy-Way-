package org.company.profilesample;

public interface JavaConfig {
    public EnvironmentInterface environmentInterface();

    public SampleEnvironment sampleEnvironment(EnvironmentInterface environmentInterface);
}
