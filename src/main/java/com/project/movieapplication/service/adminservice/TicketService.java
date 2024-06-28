package com.project.movieapplication.service.adminservice;

import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Ticket;

public interface TicketService {
    public Ticket saveTicket(Ticket ticket);
    public String deleteTicket(Long ticketId) throws CustomException;
    public String updateTicket(Long ticketId,Ticket ticket) throws CustomException;
}
