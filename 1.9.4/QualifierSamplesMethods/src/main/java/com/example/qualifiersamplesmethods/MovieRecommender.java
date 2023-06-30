package com.example.qualifiersamplesmethods;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MovieRecommender {
    private MovieCatalog catalog;
    public MovieRecommender() {}

    @Autowired
    public void prepare(@Qualifier("tvshows") MovieCatalog catalog) {
        this.catalog = catalog;
    }
    public void displayAlLVideoInformation() {
        System.out.println(catalog.toString());
    }
}