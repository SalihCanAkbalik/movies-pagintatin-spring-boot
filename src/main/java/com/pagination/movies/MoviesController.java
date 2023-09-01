package com.pagination.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {
    @Autowired
    private MoviesServicesImpl moviesServicesImpl;

    @GetMapping("/movie")
    public Page<Movies> getMovies(@PageableDefault(size = 5) Pageable pageable){
        return moviesServicesImpl.getMoviesList(pageable);
    }
}
