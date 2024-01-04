package com.lms.dao;

import org.springframework.data.repository.CrudRepository;

import com.lms.bean.Library;

public interface LibraryDAO extends CrudRepository<Library, Integer> {

}
