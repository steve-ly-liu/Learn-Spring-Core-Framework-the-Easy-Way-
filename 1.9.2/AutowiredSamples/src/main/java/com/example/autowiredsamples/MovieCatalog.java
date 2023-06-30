package com.example.autowiredsamples;

import org.springframework.core.annotation.Order;

@Order(2)
public class MovieCatalog implements VideoCatalog {
    private int movieId;
    private String movieName;
    private String categoryName;
    public MovieCatalog(int movieId, String movieName, String categoryName) {
        this.movieId = movieId;
        this.movieName = movieName;
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "\n[MovieCatalog] : {movieId=" + movieId + ", movieName=" + movieName + ", categoryName=" + categoryName + "}.\n";
    }
}
