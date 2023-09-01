package com.pagination.movies;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.AUTO;
import static jakarta.persistence.GenerationType.IDENTITY;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
public class Movies {
    @Id
    @GeneratedValue(strategy = AUTO)
    private Long id;
    private String name;
    private String genre;
    private Integer releasedYear;
    private String released;
    private Double score;
    private Integer votes;
    private String director;
    private String writer;
    private String country;
    private Long budget;
    private String company;

    public Movies(Long id, String name, String genre, Integer releasedYear, String released, Double score, Integer votes, String director, String writer, String country, Long budget, String company) {
        this.id = id;
        this.name = name;
        this.genre = genre;
        this.releasedYear = releasedYear;
        this.released = released;
        this.score = score;
        this.votes = votes;
        this.director = director;
        this.writer = writer;
        this.country = country;
        this.budget = budget;
        this.company = company;
    }
}


