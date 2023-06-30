package com.example.autowiredsamplesorder;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Arrays;
public class MovieRecommender {
    @Autowired
    private MovieCatalog[] catalogs;

    public MovieRecommender() {}
    public void displayAlLVideoInformation() {
        System.out.println(Arrays.toString(catalogs));
    }
}
