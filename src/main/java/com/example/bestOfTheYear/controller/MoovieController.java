package com.example.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/movies")
public class MoovieController {
    @GetMapping
    public String movieList() {
        return "movies";
    }
}
