package com.cfs.movie_management.controller;


import com.cfs.movie_management.model.movie;
import com.cfs.movie_management.service.movieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movie")
public class studentController {

    @Autowired
    private movieService movieService;



    @GetMapping("/all")
    public List<movie> getAllMovie()
    {
        return movieService.getAllMovies();
    }

    @GetMapping("/{id}")
    public movie getMovieByID(@PathVariable Long id)
    {
        return movieService.getMovieByID(id);

    }


    @GetMapping("/search")
    public List<movie> searchByMovieName(@RequestParam String name)
    {
        return movieService.searchByName(name);
    }

    @PostMapping
    public List<movie> save()
    {
        return movieService.getAllMovies();
    }


}
