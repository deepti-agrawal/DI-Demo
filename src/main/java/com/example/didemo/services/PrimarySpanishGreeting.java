package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile("es")
public class PrimarySpanishGreeting implements GreetingService{

    public final String MESSAGE = "Halo un dos tres";

    public String sayHello(){
        return MESSAGE;
    }


}
