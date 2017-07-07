package de.rpr.junit5springboot.web;

import de.rpr.junit5springboot.service.GreetingService;
import de.rpr.junit5springboot.service.Language;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    private final List<GreetingService> greetingServices;

    public GreetingController(final List<GreetingService> greetingServices) {
        this.greetingServices = greetingServices;
    }

    @GetMapping("/casual")
    String casualGreeting(@RequestParam(value = "lang", required = false) final String language) {
        return getGreetingService(language).casualGreeting();
    }

    @GetMapping("/morning")
    String morningGreeting(@RequestParam(value = "lang", required = false) final String language) {
        return getGreetingService(language).goodMorning();
    }

    private GreetingService getGreetingService(final String language) {
        return greetingServices.stream()
                .filter(service -> service.accepts(Language.fromKey(language)))
                .findFirst()
                .orElseThrow(RuntimeException::new);
    }


}
