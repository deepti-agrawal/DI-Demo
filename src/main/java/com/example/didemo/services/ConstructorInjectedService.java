package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class ConstructorInjectedService  implements GreetingService{

    public final String MESSAGE = "Hello Dependency Injecton via ConstructorInjectedService";

    public String sayHello(){
        return MESSAGE;
    }


}
