package com.lms.dao;

import org.springframework.data.repository.CrudRepository;

import com.lms.bean.Laptop;

public interface LaptopDAO extends CrudRepository<Laptop, Integer> {

}
