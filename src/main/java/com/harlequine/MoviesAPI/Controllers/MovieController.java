package com.harlequine.MoviesAPI.Controllers;

import com.harlequine.MoviesAPI.Models.Movie;
import com.harlequine.MoviesAPI.Services.MovieService;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController//Similar to routes folder in js structure, controller folder in spring boot handles requests and responses
//1st layer of the rest api, the API layer which is our controller which only concerns itself about the task of getting a request and sending out a response
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService service;


    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<List<Movie>>(service.allMovies(), HttpStatus.OK);
    }

    @GetMapping("/{imdbId}")
    public ResponseEntity<Optional<Movie>> getSingleMovie(@PathVariable String imdbId){
        return new ResponseEntity<>(service.singleMovie(imdbId), HttpStatus.OK);
    }
}
