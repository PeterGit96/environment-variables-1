package co.develhope.environmentvariables1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MainController {

    @Autowired
    private Environment environment;

    @GetMapping
    public String welcomeMsg() {
        return "Hello " + environment.getProperty("myCustomProps.devName")
                + ", your authCode is " + environment.getProperty("myCustomProps.authCode");
    }

}