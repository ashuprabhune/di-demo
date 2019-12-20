package guru.springframework.didemo.controllers;

import guru.springframework.didemo.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

@Controller
public class ConstructorInjectedController {

    private GreetingService greetingService;


    public ConstructorInjectedController( @Qualifier("constructorInjectedService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello()
    {
       return greetingService.sayGreeting();
    }
}
