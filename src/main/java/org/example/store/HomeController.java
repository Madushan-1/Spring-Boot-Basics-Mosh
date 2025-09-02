package org.example.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

// Tells spring that a class is web controller for receiving web traffic
@Controller
public class HomeController {

    // @Value - Takes the value from a given key from application.properties and assign it to a given variable
    // @ConfigurationProperties - you can use this when you need to assign values to multiple variables, it's a cleaner alternative to declaring multiple value tags
    @Value("${spring.application.name}")
    private String appName;

    // ::::::::::Request Mapping Explained::::::::::
    // When we send a request to the root of our website, we want this method to be called
    // RequestMapping helps with that
    // This is part of the web starter dependency
    // The argument (URL pattern) "/" defines the root of the website
    // When a request goes to the root this method will be called
    // It can be changed as required if you want to receive traffic at a different end point, "/contact"

    @RequestMapping("/")
    public String index() {
        return "index.html";
    }
}
