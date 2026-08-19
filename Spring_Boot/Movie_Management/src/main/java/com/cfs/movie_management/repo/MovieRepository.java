package com.cfs.movie_management.repo;

import com.cfs.movie_management.model.movie;

import java.util.*;
import java.util.stream.Collectors;

public class MovieRepository {

    private final Map<Long , movie> movieDB=new HashMap<>();

    public void loadDummyData()
    {
        movieDB.put(1L,new movie(1L,"Salar","Action",9.8,2022,"Hindi"));
        movieDB.put(2L,new movie(2L,"KGF","Action-romance",9.5,2022,"Hindi"));
        movieDB.put(3L,new movie(3L,"King of Kotha","Action",9.8,2023,"Hindi"));
        movieDB.put(4L,new movie(4L,"Spider-man","Action-drama",9.8,2026,"English"));

    }

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
//        return movieDB.values()
//                .stream()
//                .filter(movie -> movie.getName()!=null &&
//                        movie.getName().toLowerCase().contains(name.toLowerCase()))
//                .collect(Collectors.toList());



        List<movie> movieList = new ArrayList<>();
       for(movie collection: movieDB.values())
       {
           if(collection.getName().equals(name))
           {
               movieList.add(collection);
           }
       }
       return movieList;
    }


}
