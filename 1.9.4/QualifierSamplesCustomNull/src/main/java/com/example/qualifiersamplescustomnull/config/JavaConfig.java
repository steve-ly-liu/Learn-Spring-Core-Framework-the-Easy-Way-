package com.example.qualifiersamplescustomnull.config;

import com.example.qualifiersamplescustomnull.MovieCatalog;
import com.example.qualifiersamplescustomnull.MovieRecommender;
import com.example.qualifiersamplescustomnull.Offline;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public MovieCatalog movieCatalog() {
        return new MovieCatalog(1, "Test #1 Movie", "Drama");
    }

    @Bean
    @Offline
    public MovieCatalog tvShowsCatalog() {
        return new MovieCatalog(2, "Test #2 Tv Shows", "Program");
    }

    @Bean
    public MovieCatalog tvSeriesCatalog() {
        return new MovieCatalog(3, "Test #3 Tv Series", "Action");
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}
