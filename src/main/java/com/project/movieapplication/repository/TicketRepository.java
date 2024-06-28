package com.project.movieapplication.repository;

import com.project.movieapplication.model.Ticket;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TicketRepository extends MongoRepository<Ticket,Long> {
}
