package com.sms.controller;

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

import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class SMSController {

	@Autowired
	StudentDAO dao;
	
	@PostMapping("PerformInsert")
	public void performInsertStudent(@RequestBody Student student) {
		dao.save(student);
	}
	
	@PutMapping("PerformUpdate")
	public void performUpdateStudent(@RequestBody Student student) {
		dao.save(student);
	}
	
	@DeleteMapping("PerformDelete/{id}")
	public void performDeleteStudent(@PathVariable("id") int id) {
		dao.deleteById(id);
	}
	
	@GetMapping("ViewAll")
	public List<Student> getAllStudent() {
		Iterator<Student> it =  dao.findAll().iterator();
		ArrayList<Student> list = new ArrayList<Student>();
		
		while(it.hasNext()) {
			list.add(it.next());
		}
		
		return list;
	}
}
