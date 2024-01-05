package com.dms.dao;

import org.springframework.data.repository.CrudRepository;

import com.dms.bean.Doctor;

public interface DocotorDAO extends CrudRepository<Doctor, Integer> {

}
