package com.example.customautowireconfigurersample;



public class MovieRecommender {

    private MovieCatalog catalog;

    public MovieRecommender(@CustomMovieCatalog MovieCatalog catalog) {
        this.catalog = catalog;
    }
    public void displayAlLVideoInformation() {
        System.out.println(catalog.toString());
    }
}
