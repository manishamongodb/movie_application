package com.project.movieapplication.controller.admincontroller;


import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.MovieSession;
import com.project.movieapplication.serviceImpl.adminserviceimpl.MovieSessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/moviesession")
public class MovieSessionController {

    @Autowired
    private MovieSessionServiceImpl movieSessionServiceImpl;

    @PostMapping("/savemoviesession")
    public MovieSession saveMovieSession(@RequestBody MovieSession movieSession){
        return movieSessionServiceImpl.saveMovieSession(movieSession);
    }

    @DeleteMapping("/deletemoviesession/{movieSessionId}")
    public String deleteMovieSession(@PathVariable Long movieSessionId) throws CustomException {
        return movieSessionServiceImpl.deleteMovieSession(movieSessionId);
    }

    @PutMapping("/updatemoviesession/{movieSessionId}")
    public String updateMovieSession(@PathVariable Long movieSessionId,@RequestBody MovieSession movieSession) throws CustomException {
        return movieSessionServiceImpl.updateMovieSession(movieSessionId,movieSession);
    }
}
