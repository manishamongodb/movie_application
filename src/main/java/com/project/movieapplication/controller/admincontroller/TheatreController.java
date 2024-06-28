package com.project.movieapplication.controller.admincontroller;


import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Theatre;
import com.project.movieapplication.serviceImpl.adminserviceimpl.TheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/theatre")
public class TheatreController {

    @Autowired
    private TheatreServiceImpl theatreServiceImpl;

    @PostMapping("/savetheatre")
    public Theatre saveTheatre(@RequestBody Theatre theatre){
        return theatreServiceImpl.saveTheatre(theatre);
    }

    @DeleteMapping("/deletetheatre/{theatreId}")
    public String deleteTheatre(@PathVariable Long theatreId) throws CustomException {
        return theatreServiceImpl.deleteTheatre(theatreId);
    }

    @PutMapping("/updatetheatre/{theatreId}")
    public String updateTheatre(@PathVariable Long theatreId,@RequestBody Theatre theatre) throws CustomException {
        return theatreServiceImpl.updateTheatre(theatreId,theatre);
    }
}
