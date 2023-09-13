package com.example.bestOfTheYear.controller;

import com.example.bestOfTheYear.model.Movie;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MoovieController {
    @GetMapping
    public String movieList(Model model) {
        List<Movie> fakeMovieList = getMovies();
        model.addAttribute("bestMovieList", fakeMovieList);
        return "movies";
    }

    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Ritorno a Java", "Pinco Pallo"));
        movies.add(new Movie(2, "Java e il Tempio Maledetto", "Severus Python"));
        movies.add(new Movie(3, "Harry Potter e il calice di Java", "James Potter"));
        return movies;
    }
}
