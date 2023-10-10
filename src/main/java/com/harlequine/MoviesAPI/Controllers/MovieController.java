package com.harlequine.MoviesAPI.Controllers;

import com.harlequine.MoviesAPI.Models.Movie;
import com.harlequine.MoviesAPI.Services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController//Similar to routes folder in js structure, controller folder in spring boot handles requests and responses
//1st layer of the rest api, the API layer which is our controller which only concerns itself about the task of getting a request and sending out a response
@RequestMapping("/api/v1/movies")
public class MovieController {
    @Autowired
    private MovieService service;


    @GetMapping
    public ResponseEntity<List<Movie>> getAllMovies(){
        return new ResponseEntity<>(service.allMovies(), HttpStatus.OK);
    }
}
