package com.ems.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer>{
	
	//Employee findByName(String name);

}
