package com.example.bestOfTheYear.controller;

import com.example.bestOfTheYear.model.Song;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/songs")
public class SongsController {
    @GetMapping
    public String songsList(Model model) {
        List<Song> fakeSongsList = getSongs();
        model.addAttribute("bestSongsList", fakeSongsList);
        return "songs";
    }

    private List<Song> getSongs() {
        List<Song> songs = new ArrayList<>();
        songs.add(new Song(1, "Alleluja", "Pinco Pallo"));
        songs.add(new Song(2, "Buonasera Java", "Severus Python"));
        songs.add(new Song(3, "Java Song", "James Potter"));
        return songs;
    }

}
