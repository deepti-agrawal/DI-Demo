package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService{

    public final String MESSAGE = "Hello Dependency Injecton";

    public String sayHello(){
        return MESSAGE;
    }


}
