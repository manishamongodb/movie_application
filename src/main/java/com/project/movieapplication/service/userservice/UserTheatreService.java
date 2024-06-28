package com.project.movieapplication.service.userservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Theatre;

import java.util.List;

public interface UserTheatreService {
    public Theatre getTheatreById(Long theatreId) throws CustomException;
    public List<Theatre> getAllTheatres();
}
