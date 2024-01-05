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

	@PostMapping("PerformInsert")
	public void performInsert(@RequestBody Customer cust) {
		dao.save(cust);
	}

	@PutMapping("PerformUpdate")
	public void performUpdate(@RequestBody Customer cust) {
		dao.save(cust);
	}

	@DeleteMapping("PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}

	@GetMapping("FindAllCustomer")
	public List<Customer> getAllCustomers() {
		Iterator<Customer> it = dao.findAll().iterator();
		ArrayList<Customer> list = new ArrayList<Customer>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
