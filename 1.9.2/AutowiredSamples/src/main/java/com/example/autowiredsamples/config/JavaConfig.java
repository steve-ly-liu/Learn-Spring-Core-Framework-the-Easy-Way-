package com.example.autowiredsamples.config;

import com.example.autowiredsamples.MovieCatalog;
import com.example.autowiredsamples.MovieRecommender;
import com.example.autowiredsamples.TVShowsCatalog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public MovieCatalog movieCatalog() {
        return new MovieCatalog(0, "Movie Test", "Drama");
    }

    @Bean
    public TVShowsCatalog tvShowsCatalog() {
        return new TVShowsCatalog(1, "Tv Shows Test", "Action");
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}
