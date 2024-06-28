package com.project.movieapplication.service.adminservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Movie;

public interface MovieService {
    public Movie saveMovie(Movie movie);
    public String deleteMovie(Long movieId) throws CustomException;
    public String updateMovie(Long movieId,Movie movie) throws CustomException;
}
