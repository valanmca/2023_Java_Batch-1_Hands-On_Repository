package com.dms.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
@CrossOrigin("http://localhost:4200/")
public class DMSController {


		@Autowired
		DoctorDAO  dao;

		// Insert the record using Angular And Spring Boot

		@PostMapping("/PerformInsert")
		public void performInsert(@RequestBody Doctor doc) {
			dao.save(doc);

		}

		// Update the record using Angular And Spring Boot

		@PutMapping("/PerformUpdate")
		public void performUpdate(@RequestBody Doctor doc) {
			dao.save(doc);

		}

		// Delete the record using Angular And Spring Boot

		@DeleteMapping("/PerformDelete/{id}")
		public void performDelete(@PathVariable("id") int id) {
			dao.deleteById(id);

		}

		// Find the record using Angular And Spring Boot

		@GetMapping("/ViewAll")
		public List<Doctor> getAllDoctor() {
			System.out.println("Inside ViewAll");
			Iterator<Doctor> it = dao.findAll().iterator();
			List<Doctor> list = new ArrayList<Doctor>();
			while (it.hasNext()) {
				list.add(it.next());
			}
			return list;
		}

}
