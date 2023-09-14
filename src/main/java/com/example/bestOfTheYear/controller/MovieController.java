package com.example.bestOfTheYear.controller;

import com.example.bestOfTheYear.model.Movie;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/movies")
public class MovieController {
    @GetMapping
    public String movieList(Model model) {
        List<Movie> fakeMovieList = getMovies();
        model.addAttribute("bestMovieList", fakeMovieList);
        return "movies";
    }

    @GetMapping("/{id}")
    public String movieDetail(Model model, @PathVariable("id") int movieId) {
        List<Movie> movieList = getMovies();
        Movie movieToFind = null;
        for (Movie m : movieList) {
            if (m.getId() == movieId) {
                movieToFind = m;
            }
        }

        if (movieToFind == null) {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND,
                    "Movie with id " + movieId + " not found");
        }

        model.addAttribute("movieIdFind", movieToFind);
        return "movieDetail";
    }

    private List<Movie> getMovies() {
        List<Movie> movies = new ArrayList<>();
        movies.add(new Movie(1, "Ritorno a Java", "Pinco Pallo"));
        movies.add(new Movie(2, "Java e il Tempio Maledetto", "Severus Python"));
        movies.add(new Movie(3, "Harry Potter e il calice di Java", "James Potter"));
        return movies;
    }
}
