package com.cfs.movie_management.repo;

import com.cfs.movie_management.model.movie;

import java.util.*;
import java.util.stream.Collectors;

public class MovieRepository {

    private final Map<Long , movie> movieDB=new HashMap<>();


    public List<movie> getAllMovies()
    {
        return new ArrayList<>(movieDB.values());

    }

    public movie getMovieID(Long id)

    {
        return movieDB.get(id);
    }

    public movie saveMovie (movie movie)
    {
        movieDB.put(movie.getId(),movie);
        return movie;
    }

    public List<movie> searchByName(String name)
    {
        return movieDB.values()
                .stream()
                .filter(movie -> movie.getName()!=null &&
                        movie.getName().toLowerCase().contains(name.toLowerCase()))
                .collect(Collectors.toList());
    }


}
