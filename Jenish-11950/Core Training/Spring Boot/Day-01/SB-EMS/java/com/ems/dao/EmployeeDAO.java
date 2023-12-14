package com.ems.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.ems.bean.Employee;

public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

	/*Employee findByName(String name);

	Employee findBySalary(int salary);

	void deleteByname(String name);

	@Query("Select * from tbl_employee where salary > 2000")
	List<Employee> getAllEmployeeByUsingSalary();*/

}
