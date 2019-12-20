package guru.springframework.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterBasedService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello From Getter";
    }
}
