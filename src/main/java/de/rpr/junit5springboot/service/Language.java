package de.rpr.junit5springboot.service;

public enum Language {
    EN("en"),
    DE("de"),
    JP("jp");

    private final String key;

    Language(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static Language fromKey(String language) {
        if (Language.DE.getKey().equalsIgnoreCase(language)) {
            return Language.DE;
        }
        if (Language.JP.getKey().equalsIgnoreCase(language)) {
            return Language.JP;
        }
        return Language.EN;
    }
}
