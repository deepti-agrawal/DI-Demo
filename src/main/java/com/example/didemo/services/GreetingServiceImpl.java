package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public final String MESSAGE = "Hello Dependency Injecton-Original";

    public String sayGreeting(){
        return MESSAGE;
    }


}
