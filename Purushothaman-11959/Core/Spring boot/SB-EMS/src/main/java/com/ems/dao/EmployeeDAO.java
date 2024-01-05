package com.ems.dao;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	Employee findByEname(String ename);
	
	Employee findByEsalary(int esalary);
	
	void deleteByEname(String ename);
}
