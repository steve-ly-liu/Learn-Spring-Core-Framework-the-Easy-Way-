package com.example.autowiredsamples;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Arrays;

public class MovieRecommender {
    @Autowired
    private VideoCatalog[] catalogs;

    public MovieRecommender() {}
    public void displayAlLVideoInformation() {
        System.out.println(Arrays.toString(catalogs));
    }
}
