package com.project.movieapplication.serviceImpl.userserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Ticket;
import com.project.movieapplication.repository.TicketRepository;
import com.project.movieapplication.service.userservice.UserTicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserTicketServiceImpl implements UserTicketService {

    @Autowired
    private TicketRepository ticketRepository;


    @Override
    public Ticket getTicketById(Long ticketId) throws CustomException {
        Optional<Ticket> ticketOptional=ticketRepository.findById(ticketId);
        if(ticketOptional.isPresent()){
            return ticketOptional.get();
        }
        throw new CustomException("Ticket ID: "+ticketId+" is Not Found");
    }

    @Override
    public List<Ticket> getAllTickets() {
        return ticketRepository.findAll();
    }
}
