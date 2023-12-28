package com.dms.controller;

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

import com.dms.bean.Doctor;
import com.dms.dao.DoctorDAO;

@RestController
@CrossOrigin("http://localhost:65253/")
public class DMSController {

	@Autowired
	DoctorDAO dao;

	// Insert in SB with Angular Intergration
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Doctor doc) {
		dao.save(doc);
	}

	// Update in SB with Angular Intergration
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Doctor doc) {
		dao.save(doc);
	}

	// Delete in SB with Angular Intergration
	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}

	@GetMapping("/ViewAll")
	public List<Doctor> getAllDoctor() {
		System.out.println("Inside ViewAll");
		Iterator<Doctor> it = dao.findAll().iterator();
		ArrayList<Doctor> list = new ArrayList<Doctor>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
