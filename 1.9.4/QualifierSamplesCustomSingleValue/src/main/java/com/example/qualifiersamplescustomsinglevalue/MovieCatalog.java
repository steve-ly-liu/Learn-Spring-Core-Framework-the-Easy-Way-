package com.example.qualifiersamplescustomsinglevalue;

public class MovieCatalog {
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