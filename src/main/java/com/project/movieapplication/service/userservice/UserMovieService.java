package com.project.movieapplication.service.userservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Movie;

import java.util.List;

public interface UserMovieService {
    public Movie getMovieById(Long movieId) throws CustomException;
    public List<Movie> getAllMovies();
}
