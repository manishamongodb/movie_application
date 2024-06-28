package com.project.movieapplication.controller.admincontroller;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Movie;
import com.project.movieapplication.serviceImpl.adminserviceimpl.MovieServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/movie")
public class MovieController {

    @Autowired
    private MovieServiceImpl movieServiceImpl;

    @PostMapping("/savemovie")
    public Movie saveMovie(@RequestBody Movie movie){
        return movieServiceImpl.saveMovie(movie);
    }

    @DeleteMapping("/deletemovie/{movieId}")
    public String deleteMovie(@PathVariable Long movieId) throws CustomException {
        return movieServiceImpl.deleteMovie(movieId);
    }

    @PutMapping("/updatemovie/{movieId}")
    public String updateMovie(@PathVariable Long movieId,@RequestBody Movie movie) throws CustomException {
        return movieServiceImpl.updateMovie(movieId,movie);
    }

}
