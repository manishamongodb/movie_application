package com.project.movieapplication.serviceImpl.adminserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Theatre;
import com.project.movieapplication.repository.TheatreRepository;
import com.project.movieapplication.service.adminservice.TheatreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TheatreServiceImpl implements TheatreService {

    @Autowired
    private TheatreRepository theatreRepository;

    @Override
    public Theatre saveTheatre(Theatre theatre) {
        return theatreRepository.save(theatre);
    }

    @Override
    public String deleteTheatre(Long theatreId) throws CustomException {
        Optional<Theatre> theatre=theatreRepository.findById(theatreId);
        if(theatre.isPresent()){
            theatreRepository.deleteById(theatreId);
            return "Theatre ID: "+theatreId+" is Deleted Successfully";
        }
throw new CustomException("Theatre ID: "+theatreId+" is Not Found");
    }

    @Override
    public String updateTheatre(Long theatreId,Theatre theatre) throws CustomException {
        Optional<Theatre> theatre1=theatreRepository.findById(theatreId);
        if(theatre1.isPresent()){
            Theatre th=theatre1.get();
            th.setCapacity(theatre.getCapacity());
            th.setDescription(theatre.getDescription());
            return "Theatre ID: "+theatreId+" is Updated Successfully";
        }
        throw new CustomException("Theatre ID: "+theatreId+" is Not Found");
    }
}
