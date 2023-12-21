package com.mms.controller;

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

import com.mms.bean.Movie;
import com.mms.dao.MovieDAO;

@RestController
@CrossOrigin("http://localhost:51166/")
public class MMSController {

	@Autowired
	MovieDAO dao;
	
	// Insert the record using Angular And Spring Boot

		@PostMapping("/PerformInsert")
		public void performInsert(@RequestBody Movie mov) {
			dao.save(mov);

		}
		
		// Update the record using Angular And Spring Boot

		@PutMapping("/PerformUpdate")
		public void performUpdate(@RequestBody Movie mov) {
			dao.save(mov);

		}

		// Delete the record using Angular And Spring Boot

		@DeleteMapping("/PerformDelete/{id}")
		public void performDelete(@PathVariable("id") int id) {
			dao.deleteById(id);

		}

		// Find the record using Angular And Spring Boot

		@GetMapping("/ViewAll")
		public List<Movie> getAllEmployee() {
			System.out.println("Inside ViewAll");
			Iterator<Movie> it = dao.findAll().iterator();
			List<Movie> list = new ArrayList<Movie>();
			while (it.hasNext()) {
				list.add(it.next());
			}
			return list;
		}
	
}
