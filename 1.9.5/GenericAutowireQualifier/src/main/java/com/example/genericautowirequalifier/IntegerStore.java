package com.example.genericautowirequalifier;

public class IntegerStore implements Store<Integer> {
    public IntegerStore() {}

    public String getStoreType() {
        return "Integer Store";
    }
}
