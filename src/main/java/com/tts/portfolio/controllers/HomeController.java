package com.tts.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/about")
    public String aboutMe() {
        return "about";
    }

    @GetMapping("/mywork")
    public String myWork() {
        return "mywork";
    }

    @GetMapping("/contact")
    public String contactMe() {

        return "contact";
    }

}
