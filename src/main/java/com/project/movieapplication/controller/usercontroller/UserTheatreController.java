package com.project.movieapplication.controller.usercontroller;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Theatre;
import com.project.movieapplication.serviceImpl.userserviceimpl.UserTheatreServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/theatre")
public class UserTheatreController {

    @Autowired
    private UserTheatreServiceImpl userTheatreServiceImpl;

    @GetMapping("/getbytheatreid/{theatreId}")
    public Theatre getTheatreById(@PathVariable Long theatreId) throws CustomException {
        return userTheatreServiceImpl.getTheatreById(theatreId);
    }

    @GetMapping("getalltheatres")
    public List<Theatre> getAllTheatres(){
        return userTheatreServiceImpl.getAllTheatres();
    }
}
