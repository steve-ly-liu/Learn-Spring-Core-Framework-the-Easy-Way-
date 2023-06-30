package com.example.qualifiersamplescustomsinglevalue;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
public @interface Genre {
    String value();
}
