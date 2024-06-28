package com.project.movieapplication.controller.usercontroller;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Movie;
import com.project.movieapplication.serviceImpl.userserviceimpl.UserMovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/movie")
public class UserMovieController {

    @Autowired
    private UserMovieServiceImpl userMovieServiceImpl;

    @GetMapping("/getmoviebyid/{movieId}")
    public Movie getMovieById(@PathVariable Long movieId) throws CustomException {
        return userMovieServiceImpl.getMovieById(movieId);
    }

    @GetMapping("/getallmovies")
    public List<Movie> getAllMovies(){
        return userMovieServiceImpl.getAllMovies();
    }
}
