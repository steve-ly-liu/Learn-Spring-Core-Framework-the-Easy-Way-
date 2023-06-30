package com.example.genericautowirequalifier;

import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class StoreManager {
    @Autowired
    private Store<String> strStore;
    @Autowired
    private Store<Integer> intStore;
    @Autowired
    private List<Store<Integer>> intStoreList;

    public StoreManager() {}

    public void displayStores() {
        System.out.println("\n------------------");
        System.out.println(strStore.getStoreType() + "\n"
                    + intStore.getStoreType() + "\n");

        System.out.println("------------- intStoreList -----------------");
        intStoreList.stream().forEach(element -> {
            System.out.println(element.getStoreType());
        });
    }
}
