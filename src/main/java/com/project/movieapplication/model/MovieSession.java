package com.project.movieapplication.model;

import jakarta.persistence.ManyToOne;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;


@Data
@Document(collection = "moviesession")
public class MovieSession {

    @Id
    private Long id;
    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Theatre theatre;
    private String sessionTime;
}
