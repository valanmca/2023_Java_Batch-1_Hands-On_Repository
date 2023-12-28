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
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.sms.bean.Student;
import com.sms.dao.StudentDAO;

@RestController
@CrossOrigin("http://localhost:4200")
public class SMScontroller {
	
	@Autowired
	StudentDAO dao;
	
	
	@PostMapping("/PerformInsert")
	public void performinsertStudent(@RequestBody Student stu) {
		dao.save(stu);
	}
	@PutMapping("/PerformUpdate")
	public void performupdateStudent(@RequestBody Student stu) {
		dao.save(stu);
	}
	@DeleteMapping("/PerformDelete/{id}")
	public void performdeleteStudent(@PathVariable("id") int id) {
		dao.deleteById(id);
	}

	@GetMapping("/ViewAll")
	public List<Student> getAllStudent() {
		System.out.println("Inside View All");
		Iterator<Student> it = dao.findAll().iterator();
		List<Student> list=new ArrayList<Student>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;

	}
	

}
