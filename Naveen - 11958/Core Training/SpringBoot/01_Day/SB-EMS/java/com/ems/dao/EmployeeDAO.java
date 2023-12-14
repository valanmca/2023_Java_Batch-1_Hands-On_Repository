package com.ems.dao;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;
													//bean type , primary key data type
public interface EmployeeDAO extends CrudRepository<Employee, Integer>{
	
	//These are the extra functionalities to add up on the controller.
	Employee findByName(String name);
	
	Employee findBySalary(int salary);
	
	void deleteByName(String ename);
	
	void deleteBySalary(int salary);
	
	//If we want to write our own query.
	@Query("SELECT * FROM tbl_employee where salary > 2000")
	List<Employee> getAllEmployeeByUsingSalary();
}

