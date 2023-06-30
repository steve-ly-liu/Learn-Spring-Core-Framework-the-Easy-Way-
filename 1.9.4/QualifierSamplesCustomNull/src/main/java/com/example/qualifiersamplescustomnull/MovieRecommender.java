package com.example.qualifiersamplescustomnull;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class MovieRecommender {
    @Autowired
    private MovieCatalog movieCatalog;

    @Autowired
    @Offline
    private MovieCatalog tvShowsCatalog;

    @Autowired
    private MovieCatalog tvSeriesCatalog;

    public MovieRecommender() {}
    public void displayAlLVideoInformation() {
        System.out.println(movieCatalog.toString()
                + "\n" + tvShowsCatalog.toString()
                + "\n" + tvSeriesCatalog.toString());
    }
}
