package com.harlequine.MoviesAPI.Repositories;

import com.harlequine.MoviesAPI.Models.Movie;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository//This is where we perform CRUD operations
public interface MovieRepository extends MongoRepository<Movie, ObjectId>{
}
