package com.myfirstspringboot.first_java_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Welcome {

    @GetMapping("/")
    public String main() {
        return new String("Main Page");
    }

    // @GetMapping("/welcome")
    // public String rounte() {
    // return "Welcome to home";
    // }

    @GetMapping("/about")
    public String about_me() {
        return new String("My name is Vasanth");
    }

}
