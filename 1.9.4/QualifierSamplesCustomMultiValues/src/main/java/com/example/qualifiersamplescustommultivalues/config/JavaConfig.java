package com.example.qualifiersamplescustommultivalues.config;

import com.example.qualifiersamplescustommultivalues.Format;
import com.example.qualifiersamplescustommultivalues.MovieCatalog;
import com.example.qualifiersamplescustommultivalues.MovieQualifier;
import com.example.qualifiersamplescustommultivalues.MovieRecommender;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    @MovieQualifier(genre = "movie", format = Format.DVD)
    public MovieCatalog movieCatalog() {
        return new MovieCatalog(1, "Test #1 Movie", "Drama");
    }
    @Bean
    @MovieQualifier(genre = "tvshows", format = Format.BLURAY)
    public MovieCatalog tvShowsCatalog() {
        return new MovieCatalog(2, "Test #2 Tv Shows", "Program");
    }

    @Bean
    @MovieQualifier(genre = "tvseries", format = Format.VHS)
    public MovieCatalog tvSeriesCatalog() {
        return new MovieCatalog(3, "Test #3 Tv Series", "Action");
    }

    @Bean
    public MovieRecommender movieRecommender() {
        return new MovieRecommender();
    }
}
