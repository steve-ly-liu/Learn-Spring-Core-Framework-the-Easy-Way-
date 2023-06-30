package com.example.qualifiersamplescustommultivalues;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier
public @interface MovieQualifier {
    String genre();
    Format format();
}
