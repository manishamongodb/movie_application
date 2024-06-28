package com.project.movieapplication.controller.admincontroller;


import com.project.movieapplication.exception.CustomException;
import com.project.movieapplication.model.Ticket;
import com.project.movieapplication.serviceImpl.adminserviceimpl.TicketServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/ticket")
public class TicketController {

    @Autowired
    private TicketServiceImpl ticketServiceImpl;

    @PostMapping("/saveticket")
    public Ticket saveTicket(@RequestBody Ticket ticket){
        return ticketServiceImpl.saveTicket(ticket);
    }

    @DeleteMapping("/deleteticket/{ticketId}")
    public String deleteTicketById(@PathVariable Long ticketId) throws CustomException {
        return ticketServiceImpl.deleteTicket(ticketId);
    }

    @PutMapping("/updateticket/{ticketId}")
    public String updateTicketById(@PathVariable Long ticketId,@RequestBody Ticket ticket) throws CustomException {
        return ticketServiceImpl.updateTicket(ticketId,ticket);
    }
}
