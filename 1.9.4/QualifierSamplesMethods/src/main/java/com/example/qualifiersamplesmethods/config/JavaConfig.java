package com.example.qualifiersamplesmethods.config;

import com.example.qualifiersamplesmethods.MovieCatalog;
import com.example.qualifiersamplesmethods.MovieRecommender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @Qualifier("movie")
    public MovieCatalog movieCatalog() {
        return new MovieCatalog(0, "Jerry and Marge Go Large", "Drama");
    }

    @Bean
    @Qualifier("tvshows")
    public MovieCatalog tvShowsCatalog() {
        return new MovieCatalog(1, "24 Hours", "Action");
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}