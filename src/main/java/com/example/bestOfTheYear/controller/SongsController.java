package com.example.bestOfTheYear.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/songs")
public class SongsController {
    @GetMapping
    public String songsList() {
        return "songs";
    }
}
