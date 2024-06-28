package com.project.movieapplication.serviceImpl.adminserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.MovieSession;
import com.project.movieapplication.repository.MovieSessionRepository;
import com.project.movieapplication.service.adminservice.MovieSessionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieSessionServiceImpl implements MovieSessionService {

    @Autowired
    private MovieSessionRepository movieSessionRepository;

    @Override
    public MovieSession saveMovieSession(MovieSession movieSession) {
        return movieSessionRepository.save(movieSession);
    }

    @Override
    public String deleteMovieSession(Long movieSessionId) throws CustomException {
        Optional<MovieSession> movieSession=movieSessionRepository.findById(movieSessionId);
        if(movieSession.isPresent()){
            movieSessionRepository.deleteById(movieSessionId);
            return "MovieSession ID: "+movieSessionId+" is Deleted Successfully";
        }
        throw new CustomException("MovieSession ID: "+movieSessionId+" is Not Found");
    }

    @Override
    public String updateMovieSession(Long movieSessionId,MovieSession movieSession) throws CustomException {
        Optional<MovieSession> movieSession1=movieSessionRepository.findById(movieSessionId);
        if(movieSession1.isPresent()){
            MovieSession ms=movieSession1.get();
            ms.setMovie(movieSession.getMovie());
            ms.setTheatre(movieSession.getTheatre());
            ms.setSessionTime(movieSession.getSessionTime());
            return "MovieSession ID: "+movieSessionId+" is Updated Successfully";
        }
        throw new CustomException("MovieSession ID: "+movieSessionId+" is Not Found");
    }
}
