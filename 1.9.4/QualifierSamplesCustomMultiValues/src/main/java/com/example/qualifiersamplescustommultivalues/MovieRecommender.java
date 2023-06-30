package com.example.qualifiersamplescustommultivalues;

import org.springframework.beans.factory.annotation.Autowired;

public class MovieRecommender {
    @Autowired
    @MovieQualifier(genre = "movie", format = Format.DVD)
    private MovieCatalog movieCatalog;

    @Autowired
    @MovieQualifier(genre = "tvshows", format = Format.VHS)
    private MovieCatalog tvShowsCatalog;

    @Autowired
    @MovieQualifier(genre = "tvshows", format = Format.BLURAY)
    private MovieCatalog tvSeriesCatalog;

    public MovieRecommender() {}
    public void displayAlLVideoInformation() {
        System.out.println(movieCatalog.toString()
                + "\n" + tvShowsCatalog.toString()
                + "\n" + tvSeriesCatalog.toString());
    }
}
