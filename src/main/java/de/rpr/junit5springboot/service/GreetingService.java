package de.rpr.junit5springboot.service;

public interface GreetingService {

    boolean accepts(Language language);

    String casualGreeting();

    String goodMorning();
}
