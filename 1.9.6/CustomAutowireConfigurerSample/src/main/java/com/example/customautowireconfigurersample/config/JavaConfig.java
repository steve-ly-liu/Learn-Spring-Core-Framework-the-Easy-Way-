package com.example.customautowireconfigurersample.config;

import com.example.customautowireconfigurersample.CustomMovieCatalog;
import com.example.customautowireconfigurersample.MovieCatalog;
import com.example.customautowireconfigurersample.MovieRecommender;
import org.springframework.beans.factory.annotation.CustomAutowireConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import java.util.HashSet;
import java.util.Set;

@Configuration
public class JavaConfig {
    @Bean
    public CustomAutowireConfigurer customMovieCatalog() {
        Set<Class> customQualifierTypes = new HashSet<>();
        customQualifierTypes.add(CustomMovieCatalog.class);
        CustomAutowireConfigurer configurer = new CustomAutowireConfigurer();
        configurer.setCustomQualifierTypes(customQualifierTypes);
        return configurer;
    }
    @Bean(autowireCandidate = false)
    @CustomMovieCatalog
    public MovieCatalog movieCatalog() {
        return new MovieCatalog(0, "Jerry and Marge Go Large", "Drama");
    }

    @Bean
    @CustomMovieCatalog
    public MovieCatalog tvShowsCatalog() {
        return new MovieCatalog(1, "24 Hours", "Action");
    }

    @Bean
    public MovieRecommender movieRecommender(@CustomMovieCatalog MovieCatalog movieCatalog) {
        return new MovieRecommender(movieCatalog);
    }
}
