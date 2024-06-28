package com.project.movieapplication.service.adminservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.MovieSession;

public interface MovieSessionService {
    public MovieSession saveMovieSession(MovieSession movieSession);
    public String deleteMovieSession(Long movieSessionId) throws CustomException;
    public String updateMovieSession(Long movieSessionId,  MovieSession movieSession) throws CustomException;
}
