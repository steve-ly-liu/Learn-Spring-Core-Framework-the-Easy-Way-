package com.example.qualifiersamplescustomsinglevalue.config;

import com.example.qualifiersamplescustomsinglevalue.Genre;
import com.example.qualifiersamplescustomsinglevalue.MovieCatalog;
import com.example.qualifiersamplescustomsinglevalue.MovieRecommender;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @Genre("movie")
    public MovieCatalog movieCatalog() {
        return new MovieCatalog(0, "Jerry and Marge Go Large", "Drama");
    }

    @Bean
    @Genre("tvshows")
    public MovieCatalog tvShowsCatalog() {
        return new MovieCatalog(1, "24 Hours", "Action");
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}