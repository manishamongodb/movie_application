package com.project.movieapplication.service.userservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.MovieSession;

import java.util.List;

public interface UserMovieSessionService {
    public MovieSession getMovieSessionById(Long movieSessionId) throws CustomException;
    public List<MovieSession> getAllMovieSessions();
}
