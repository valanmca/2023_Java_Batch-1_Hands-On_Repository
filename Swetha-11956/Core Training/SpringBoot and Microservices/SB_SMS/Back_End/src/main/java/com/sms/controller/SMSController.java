package com.sms.controller;

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
import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

@RestController
@CrossOrigin("http://localhost:4200/")


public class SMSController {

	@Autowired
	StudentDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Student stud) {
		dao.save(stud);
	}
	
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Student stud) {
		dao.save(stud);
	}
	
	@DeleteMapping("/PerformDelete/{rno}")
	public void performDelete(@PathVariable("rno") int rno ){
		dao.deleteById(rno);
	}
	
	@GetMapping("/ViewAll")
	public List<Student> getAllStudents() {
		System.out.println("Inside view all");
		Iterator<Student> it = dao.findAll().iterator();
		List<Student> list = new ArrayList<Student>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
}
