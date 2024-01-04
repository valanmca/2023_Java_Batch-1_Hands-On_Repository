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

	@PostMapping("performInsert")
    public void performInsert(@RequestBody Customer cust) {
        dao.save(cust);
    }
    @PutMapping("performUpdate")
    public void PerformUpdate(@RequestBody Customer cust) {
        dao.save(cust);
    }
	@DeleteMapping("/performDelete/{id}")
	public void loadDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}
	@GetMapping("/viewAll")
	public List<Customer> loadAll() {
		Iterator<Customer> it = dao.findAll().iterator();
		ArrayList<Customer> list = new ArrayList<Customer>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
