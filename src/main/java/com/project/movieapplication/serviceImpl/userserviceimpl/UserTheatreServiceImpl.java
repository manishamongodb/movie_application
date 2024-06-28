package com.project.movieapplication.serviceImpl.userserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Theatre;
import com.project.movieapplication.repository.TheatreRepository;
import com.project.movieapplication.service.userservice.UserTheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserTheatreServiceImpl implements UserTheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    @Override
    public Theatre getTheatreById(Long theatreId) throws CustomException {
        Optional<Theatre> theatreOptional=theatreRepository.findById(theatreId);
        if(theatreOptional.isPresent()){
            return theatreOptional.get();
        }
        throw new CustomException("Theatre ID: "+theatreId+" is Not Found");
    }

    @Override
    public List<Theatre> getAllTheatres() {
        return theatreRepository.findAll();
    }
}
