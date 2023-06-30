package com.example.qualifiersamplesfields;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MovieRecommender {
    @Autowired
    @Qualifier("movie")
    private MovieCatalog catalog;

    public MovieRecommender() {}
    public void displayAlLVideoInformation() {
        System.out.println(catalog.toString());
    }
}
