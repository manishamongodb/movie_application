package com.project.movieapplication.controller.usercontroller;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Ticket;
import com.project.movieapplication.serviceImpl.userserviceimpl.UserTicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v2/ticket")
public class UserTicketController {

    @Autowired
    private UserTicketServiceImpl userTicketServiceImpl;

    @GetMapping("getticketbyid/{ticketId}")
    public Ticket getTicketById(@PathVariable Long ticketId) throws CustomException {
        return userTicketServiceImpl.getTicketById(ticketId);
    }

    @GetMapping("getalltickets")
    public List<Ticket> getAllTickets(){
        return userTicketServiceImpl.getAllTickets();
    }
}
