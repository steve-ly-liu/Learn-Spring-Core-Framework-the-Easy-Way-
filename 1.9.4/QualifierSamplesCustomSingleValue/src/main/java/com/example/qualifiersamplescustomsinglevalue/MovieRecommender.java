package com.example.qualifiersamplescustomsinglevalue;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {
    @Autowired
    @Genre("movie")
    private MovieCatalog movieCatalog;

    private MovieCatalog tvShowsCatalog;

    @Autowired
    public void setTvShowsCatalog(@Genre("tvshows") MovieCatalog tvShowsCatalog) {
        this.tvShowsCatalog = tvShowsCatalog;
    }

    public MovieRecommender() {}
    public void displayAlLVideoInformation() {

        System.out.println(movieCatalog.toString() + "\n" + tvShowsCatalog.toString());
    }
}
