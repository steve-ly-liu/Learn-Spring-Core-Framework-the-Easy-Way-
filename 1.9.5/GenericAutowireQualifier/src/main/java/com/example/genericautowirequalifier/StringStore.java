package com.example.genericautowirequalifier;

public class StringStore implements Store<String> {
    public StringStore() {}

    public String getStoreType() {
        return "String Store";
    }
}
