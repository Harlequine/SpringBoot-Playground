package com.harlequine.MoviesAPI.Models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.DocumentReference;

import java.util.List;

@Document(collection = "movies") //this class sheet presents each document in the movie collections
//similar to js creating a model for mongodb
@Data
@AllArgsConstructor// an annotation for creating a constructor that takes all the private fields in this class as arguments
@NoArgsConstructor// similar to AllargsConstructor but takes no parameters/arguments
public class Movie {

    @Id //annotation for the framework to know that this is the unique identifier for each data inside the collection in the database.
    private ObjectId id;
    private String imdbId;
    private String title;
    private String startDate;
    private String releaseDate;
    private String trailerLink;
    private String poster;
    private List<String> genres;
    private List<String> backdrops;

    @DocumentReference // Manual Reference relationship between Movie collection and Review Collection
    private List<Review> reviewId;// unlike in js where you create a model where its field has a value of an object, and you simply write it as is inline. In Java, you need a blueprint or in OOP we call it a class to construct the structure of the value of that field.


}
