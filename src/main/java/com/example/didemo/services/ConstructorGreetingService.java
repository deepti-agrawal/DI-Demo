package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorGreetingService implements GreetingService{

    public final String MESSAGE = "Hello Dependency Injecton via Constructor";

    public String sayGreeting(){
        return MESSAGE;
    }


}
