package com.applovin.applovin_max;

public enum PreloadNativeAdName {
    NATIVE1("native1"),
    NATIVE2("native2"),
    NATIVE3("native3"),
    NATIVE4("native4"),
    NATIVE5("native5");


    private final String name;

    PreloadNativeAdName(String description) {
        this.name = description;
    }

    public String getName() {
        return name;
    }
}
