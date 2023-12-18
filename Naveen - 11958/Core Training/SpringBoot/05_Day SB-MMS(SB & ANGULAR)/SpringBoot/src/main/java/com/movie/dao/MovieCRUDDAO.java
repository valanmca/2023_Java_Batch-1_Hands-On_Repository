package com.movie.dao;

import org.springframework.data.repository.CrudRepository;

import com.movie.bean.MovieCRUD;

public interface MovieCRUDDAO extends CrudRepository<MovieCRUD, Integer>{

}
