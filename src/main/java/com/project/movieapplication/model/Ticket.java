package com.project.movieapplication.model;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "ticket")
public class Ticket {

    @Id
    private Long id;
    @ManyToOne  //ManyToOne Relationship
    private MovieSession movieSession;
}
