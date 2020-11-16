package com.tts.portfolio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    
    @GetMapping("/")
    public String index() {

        return "index";
    }

    @GetMapping("/projects")
    public String projectsPage() {

        return "projects";
    }

    @GetMapping("/guitar")
    public String guitarPage() {

        return "guitar";
    }


}
