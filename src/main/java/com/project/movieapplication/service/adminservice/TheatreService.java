package com.project.movieapplication.service.adminservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Theatre;

public interface TheatreService {
    public Theatre saveTheatre(Theatre theatre);
    public String deleteTheatre(Long theatreId) throws CustomException;
    public String updateTheatre(Long theatreId,Theatre theatre) throws CustomException;
}
