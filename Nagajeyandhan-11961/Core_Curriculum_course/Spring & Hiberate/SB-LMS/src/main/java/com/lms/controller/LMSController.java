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

import com.lms.bean.Library;
import com.lms.dao.LibraryDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class LMSController {
	@Autowired
	LibraryDAO dao;
	
	@PostMapping("performInsert")
	public void insertRecord(@RequestBody Library lib) {
		dao.save(lib);
	}
	@PutMapping("performUpdate")
	public void updateRecord(@RequestBody Library lib) {
		dao.save(lib);
	}
	@DeleteMapping("performDelete/{id}")
	public void deleteRecord(@PathVariable ("id") int id) {
		dao.deleteById(id);
	}
	@GetMapping("ViewAll")
	public List<Library> getAllRecord() {
		Iterator<Library> it = dao.findAll().iterator();
		ArrayList<Library> list = new ArrayList<Library>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
