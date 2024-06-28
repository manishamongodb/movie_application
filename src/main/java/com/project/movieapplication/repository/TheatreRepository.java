package com.project.movieapplication.repository;

import com.project.movieapplication.model.Theatre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TheatreRepository extends MongoRepository<Theatre,Long> {
}
