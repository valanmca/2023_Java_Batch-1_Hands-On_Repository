package com.lms.controller;

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

import com.lms.bean.Laptop;
import com.lms.dao.LaptopDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LMSController {

	@Autowired
	LaptopDAO dao;

	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Laptop lap) {
		dao.save(lap);
	}

	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Laptop lap) {
		dao.save(lap);
	}

	@DeleteMapping("/PerformDelete/{lid}")
	public void performDelete(@PathVariable("lid") int lid) {
		dao.deleteById(lid);
	}

	@GetMapping("/View")
	public List<Laptop> getAllLaptop() {
		Iterator<Laptop> it = dao.findAll().iterator();
		List<Laptop> list = new ArrayList<Laptop>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
