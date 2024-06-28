package com.project.movieapplication.serviceImpl.adminserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Movie;
import com.project.movieapplication.repository.MovieRepository;
import com.project.movieapplication.service.adminservice.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    @Override
    public Movie saveMovie(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public String deleteMovie(Long movieId) throws CustomException {
        Optional<Movie> movie=movieRepository.findById(movieId);
        if(movie.isPresent()){
            movieRepository.deleteById(movieId);
            return "Movie ID: "+movieId+" is Deleted Successfully";
        }
        throw new CustomException("Movie ID: "+movieId+" is Not Found");
    }

    @Override
    public String updateMovie(Long movieId,Movie movie) throws CustomException {
         Optional<Movie> movie1=movieRepository.findById(movieId);
         if(movie1.isPresent()){
             Movie m1=movie1.get();
             m1.setTitle(movie.getTitle());
             m1.setDescription(movie.getDescription());
             movieRepository.save(m1);
             return "Movie ID: "+movieId+" is Updated Successfully";
         }

        throw new CustomException("Movie ID: "+movieId+" is Not Found");
    }
}
