package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;


import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


@RestController
@CrossOrigin("http://localhost:4200/")
public class EMSController {

	@Autowired
	EmployeeDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Employee bean) {
		dao.save(bean);
		
	}
	
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Employee bean) {
		dao.save(bean);
		
	}
	
	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	
	}
	
	@GetMapping("/ViewAll")
	public List<Employee> getAllEmployee() {
		Iterator<Employee> it =  dao.findAll().iterator();
		List<Employee> list = new ArrayList<Employee>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
