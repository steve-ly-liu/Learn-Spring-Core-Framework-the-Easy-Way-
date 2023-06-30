package org.company.beanresourceloaderaware;

import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class SampleBean implements ResourceLoaderAware {
    private ResourceLoader resourceLoader;

    public SampleBean() {}

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void readResource() throws IOException {
        Resource resource = resourceLoader.getResource("classpath:test.properties");

        InputStream in = resource.getInputStream();
        Properties prop = new Properties();

        prop.load(in);


        System.out.println("\n" + prop.getProperty("Name"));
        System.out.println(prop.getProperty("Source"));
    }
}
