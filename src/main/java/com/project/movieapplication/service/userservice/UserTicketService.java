package com.project.movieapplication.service.userservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Ticket;

import java.util.List;

public interface UserTicketService {
    public Ticket getTicketById(Long ticketId) throws CustomException;
    public List<Ticket> getAllTickets();
}
