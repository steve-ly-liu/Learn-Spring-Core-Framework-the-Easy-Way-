package com.example.autowiredsamples;

import org.springframework.core.annotation.Order;

@Order(0)
public class TVShowsCatalog implements VideoCatalog {
    private int tvShowsId;
    private String tvShowsName;
    private String categoryName;
    public TVShowsCatalog(int tvShowsId, String tvShowsName, String categoryName) {
        this.tvShowsId = tvShowsId;
        this.tvShowsName = tvShowsName;
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "\n[TVShowsCatalog] : {tvShowsId=" + tvShowsId + ", tvShowsName=" + tvShowsName + ", categoryName=" + categoryName + "}.\n";
    }
}
