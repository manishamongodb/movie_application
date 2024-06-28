package com.project.movieapplication.controller.usercontroller;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.MovieSession;
import com.project.movieapplication.serviceImpl.userserviceimpl.UserMovieSessionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/moviesession")
public class UserMovieSessionController {

    @Autowired
    private UserMovieSessionServiceImpl userMovieSessionServiceImpl;

    @GetMapping("/getmoviesessionbyid/{movieSessionId}")
    public MovieSession getMovieSessionById(@PathVariable Long movieSessionId) throws CustomException {
        return userMovieSessionServiceImpl.getMovieSessionById(movieSessionId);
    }

    @GetMapping("/getallmoviesessions")
    public List<MovieSession> getAllMovieSessions(){
        return userMovieSessionServiceImpl.getAllMovieSessions();
    }
}
