package com.ems.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	Employee findByEname(String ename);
	
	Employee findByEsalary(int esalary);
	
//	@Query(SELECT * from tbl_employee where esalary = 1000)
//	List
}
