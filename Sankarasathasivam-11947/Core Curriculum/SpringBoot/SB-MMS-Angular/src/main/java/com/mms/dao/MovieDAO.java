package com.mms.dao;

import org.springframework.data.repository.CrudRepository;

import com.mms.bean.Movie;

public interface MovieDAO extends CrudRepository<Movie, Integer> {

}
