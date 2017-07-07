package de.rpr.junit5springboot.service;

import org.springframework.stereotype.Service;

@Service
public class JapaneseGreetingService implements GreetingService {

    @Override
    public boolean accepts(Language language) {
        return Language.JP == language;
    }

    @Override
    public String casualGreeting() {
        return "Konnichiwa";
    }

    @Override
    public String goodMorning() {
        return "Ohayō gozaimasu";
    }
}
