package com.project.movieapplication.serviceImpl.adminserviceimpl;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Ticket;
import com.project.movieapplication.repository.TicketRepository;
import com.project.movieapplication.service.adminservice.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class TicketServiceImpl implements TicketService {

    @Autowired
    private TicketRepository ticketRepository;

    @Override
    public Ticket saveTicket(Ticket ticket) {
        return ticketRepository.save(ticket);
    }

    @Override
    public String deleteTicket(Long ticketId) throws CustomException {
        Optional<Ticket> ticket=ticketRepository.findById(ticketId);
        if(ticket.isPresent()){
            ticketRepository.deleteById(ticketId);
            return "Ticket ID: "+ticketId+" is Deleted Successfully";
        }
        throw new CustomException("Ticket ID: "+ticketId+" is Not Found");
    }

    @Override
    public String updateTicket(Long ticketId,Ticket ticket) throws CustomException {
        Optional<Ticket> ticket1=ticketRepository.findById(ticketId);
        if(ticket1.isPresent()){
            Ticket ticket2=ticket1.get();
            ticket2.setMovieSession(ticket.getMovieSession());
            return "Ticket ID: "+ticketId+" is Updated Successfully";
        }
        throw new CustomException("Ticket ID: "+ticketId+" is Not Found");
    }
}
