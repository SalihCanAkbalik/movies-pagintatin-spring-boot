package com.pagination.movies;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface MoviesServicesImpl {
    List<Movies> getMoviesList(Integer no, Integer size);

    Page<Movies> getMoviesList(Pageable pageable);
}
