package com.project.movieapplication.serviceImpl.userserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Movie;
import com.project.movieapplication.repository.MovieRepository;
import com.project.movieapplication.service.userservice.UserMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserMovieServiceImpl implements UserMovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie getMovieById(Long movieId) throws CustomException {
        Optional<Movie> movieOptional=movieRepository.findById(movieId);
        if(movieOptional.isPresent()){
            return movieOptional.get();
        }
        throw new CustomException("Movie ID: "+movieId+" is Not Found");
    }

    @Override
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
}
