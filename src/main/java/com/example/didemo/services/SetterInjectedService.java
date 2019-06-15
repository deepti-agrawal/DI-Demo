package com.example.didemo.services;

import org.springframework.stereotype.Service;

@Service
public class SetterInjectedService  implements GreetingService{

    public final String MESSAGE = "Hello Dependency Injecton via SetterInjectedService";

    public String sayHello(){
        return MESSAGE;
    }


}
