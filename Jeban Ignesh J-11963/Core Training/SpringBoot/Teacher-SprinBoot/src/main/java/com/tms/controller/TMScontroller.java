package com.tms.controller;

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


import com.tms.bean.Teacher;
import com.tms.dao.TeacherDAO;

@RestController
@CrossOrigin("http://localhost:4200s")
public class TMScontroller {
	@Autowired
	TeacherDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performinsertTeacher(@RequestBody Teacher tea) {
		dao.save(tea);
	}
	@PutMapping("/PerformUpdate")
	public void performupdateTeacher(@RequestBody Teacher tea) {
		dao.save(tea);
	}
	@DeleteMapping("/PerformDelete/{id}")
	public void performdeleteTeacher(@PathVariable("id") int id) {
		dao.deleteById(id);
	}

	@GetMapping("/ViewAll")
	public List<Teacher> getAllTeacher() {
		System.out.println("Inside View All");
		Iterator<Teacher> it = dao.findAll().iterator();
		List<Teacher> list=new ArrayList<Teacher>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;

	}

}
