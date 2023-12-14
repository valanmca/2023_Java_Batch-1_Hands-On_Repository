package com.ems.dao;

import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;
													//bean type , primary key data type
public interface EmployeeDAO extends CrudRepository<Employee, Integer>{
	

}

