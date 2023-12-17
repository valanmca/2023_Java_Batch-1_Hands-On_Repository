package com.fms.dao;

import org.springframework.data.repository.CrudRepository;

import com.fms.bean.Flight;

public interface FlightDAO extends CrudRepository<Flight, Integer>{

}
