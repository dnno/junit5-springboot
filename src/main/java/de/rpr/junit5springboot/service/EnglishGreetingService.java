package de.rpr.junit5springboot.service;

import org.springframework.stereotype.Service;

@Service
public class EnglishGreetingService implements GreetingService {

    @Override
    public boolean accepts(Language language) {
        return Language.EN == language;
    }

    @Override
    public String casualGreeting() {
        return "Hi!";
    }

    @Override
    public String goodMorning() {
        return "Good Morning";
    }
}
