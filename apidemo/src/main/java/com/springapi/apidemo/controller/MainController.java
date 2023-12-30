package com.springapi.apidemo.controller;

// import getmapping
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/employee")


public class MainController {
    // getmapping is a shortcut for requestmapping(method=get)
    // requestmapping is a shortcut for requestmapping(method=get, path="/")
    @GetMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    // write getmapping using hashmap for employee
    
    // BEGIN: Additional code can be added here
    
    // END: Additional code
    

}
