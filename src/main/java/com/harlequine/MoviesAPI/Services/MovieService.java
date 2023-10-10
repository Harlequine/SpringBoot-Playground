package com.harlequine.MoviesAPI.Services;

import com.harlequine.MoviesAPI.Models.Movie;
import com.harlequine.MoviesAPI.Repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieService {
    //Database Access Methods
    @Autowired
    private MovieRepository repository;

    public List<Movie> allMovies(){
        return repository.findAll();
    }
}
