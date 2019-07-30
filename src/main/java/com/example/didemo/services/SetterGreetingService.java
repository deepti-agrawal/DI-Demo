package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterGreetingService implements GreetingService{

    public final String MESSAGE = "Hello Dependency Injecton via setter";

    public String sayGreeting(){
        return MESSAGE;
    }


}
