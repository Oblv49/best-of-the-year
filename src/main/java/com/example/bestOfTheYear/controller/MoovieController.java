package com.example.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/moovies")
public class MoovieController {
    @GetMapping
    public String movieList() {
        return "moovies";
    }
}
