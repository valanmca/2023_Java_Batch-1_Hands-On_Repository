package com.cms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class CMSController {
	@Autowired
	CustomerDAO dao;

	// Insert the record using Angular And Spring Boot
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Customer cus) {
		dao.save(cus);
	}

	// Update the record using Angular And Spring Boot
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Customer cus) {
		dao.save(cus);
	}

	// Delete the record using Angular And Spring Boot
	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}

	// Find the record using Angular And Spring Boot
	@GetMapping("/ViewAll")
	public List<Customer> getAllCustomer() {
		System.out.println("Inside ViewAll");
		Iterator<Customer> it = dao.findAll().iterator();
		List<Customer> list = new ArrayList<Customer>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
