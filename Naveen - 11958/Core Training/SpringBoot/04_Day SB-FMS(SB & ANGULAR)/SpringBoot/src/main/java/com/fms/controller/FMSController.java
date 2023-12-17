package com.fms.controller;

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

import com.fms.bean.Flight;
import com.fms.dao.FlightDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class FMSController {

	@Autowired
	FlightDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Flight bean) {
		dao.save(bean);
		
	}
	
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Flight bean) {
		dao.save(bean);
		
	}
	
	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	
	}
	
	@GetMapping("/ViewAll")
	public List<Flight> getAll() {
		Iterator<Flight> it =  dao.findAll().iterator();
		List<Flight> list = new ArrayList<Flight>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
