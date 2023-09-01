package com.pagination.movies;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesServices implements MoviesServicesImpl{
    @Autowired
    private MoviesRepository moviesRepository;

    @Override
    public List<Movies> getMoviesList(Integer no, Integer size){
        PageRequest pageable = PageRequest.of(no,size);
        Page<Movies> moviesPage = moviesRepository.findAll(pageable);
        return moviesPage.toList();

    }

    @Override
    public Page<Movies> getMoviesList(Pageable pageable) {
        return moviesRepository.findAll(pageable);
    }
}
