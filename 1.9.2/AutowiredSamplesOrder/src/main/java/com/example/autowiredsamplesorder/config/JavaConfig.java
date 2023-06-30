package com.example.autowiredsamplesorder.config;

import com.example.autowiredsamplesorder.MovieCatalog;
import com.example.autowiredsamplesorder.MovieRecommender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

@Configuration
public class JavaConfig {
    @Bean
    @Order(1)
    public MovieCatalog movieCatalog() {
        return new MovieCatalog(0, "Jerry and Marge Go Large", "Drama");
    }

    @Bean
    @Order(0)
    public MovieCatalog tvShowsCatalog() {
        return new MovieCatalog(1, "24 Hours", "Action");
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}
