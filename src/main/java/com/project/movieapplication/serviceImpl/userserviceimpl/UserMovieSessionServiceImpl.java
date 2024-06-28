package com.project.movieapplication.serviceImpl.userserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.MovieSession;
import com.project.movieapplication.repository.MovieSessionRepository;
import com.project.movieapplication.service.userservice.UserMovieService;
import com.project.movieapplication.service.userservice.UserMovieSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserMovieSessionServiceImpl implements UserMovieSessionService {

    @Autowired
    private MovieSessionRepository movieSessionRepository;

    @Override
    public MovieSession getMovieSessionById(Long movieSessionId) throws CustomException {
        Optional<MovieSession> movieSessionOptional=movieSessionRepository.findById(movieSessionId);
        if(movieSessionOptional.isPresent()){
            return movieSessionOptional.get();
        }
        throw new CustomException("MovieSession ID: "+movieSessionId+" is Not Found");
    }

    @Override
    public List<MovieSession> getAllMovieSessions() {
        return movieSessionRepository.findAll();
    }
}
