package com.example.genericautowirequalifier.config;

import com.example.genericautowirequalifier.IntegerStore;
import com.example.genericautowirequalifier.StoreManager;
import com.example.genericautowirequalifier.StringStore;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
    @Bean
    public IntegerStore intStore() {
        return new IntegerStore();
    }

    @Bean
    public StringStore strStore() {
        return new StringStore();
    }

    @Bean
    public StoreManager storeManager() {
        return new StoreManager();
    }
}
