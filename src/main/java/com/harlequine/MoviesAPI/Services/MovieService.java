package com.harlequine.MoviesAPI.Services;

import com.harlequine.MoviesAPI.Models.Movie;
import com.harlequine.MoviesAPI.Repositories.MovieRepository;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    //Database Access Methods
    @Autowired
    private MovieRepository repository;

    public List<Movie> allMovies(){
        return repository.findAll();
    }

    public Optional<Movie> singleMovie(String imdbId){// in the case of returning null, use Optional so that java know that we are returning null;
        return repository.findMovieByImdbId(imdbId);
    }
}
