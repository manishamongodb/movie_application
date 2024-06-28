package com.project.movieapplication.repository;

import com.project.movieapplication.model.MovieSession;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface MovieSessionRepository extends MongoRepository<MovieSession,Long> {
}
