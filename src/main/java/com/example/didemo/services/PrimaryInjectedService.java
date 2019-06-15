package com.example.didemo.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en","default"})
public class PrimaryInjectedService  implements GreetingService{

    public final String MESSAGE = "Hello Dependency Injecton via Primary Greeting Service";

    public String sayHello(){
        return MESSAGE;
    }


}
