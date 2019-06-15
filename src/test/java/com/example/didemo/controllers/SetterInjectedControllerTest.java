package com.example.didemo.controllers;

import com.example.didemo.controllers.SetterInjectedController;
import com.example.didemo.services.GreetingServiceImpl;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SetterInjectedControllerTest {

    private SetterInjectedController controller;

    @Before
    public void setUp(){
        this.controller = new SetterInjectedController();
        this.controller.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testGreeting() throws Exception{
        assertEquals("Hello Dependency Injecton",controller.sayHello());

    }
}
