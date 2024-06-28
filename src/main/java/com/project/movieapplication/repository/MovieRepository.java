package com.project.movieapplication.repository;

import com.project.movieapplication.model.Movie;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieRepository extends MongoRepository<Movie,Long> {
}
