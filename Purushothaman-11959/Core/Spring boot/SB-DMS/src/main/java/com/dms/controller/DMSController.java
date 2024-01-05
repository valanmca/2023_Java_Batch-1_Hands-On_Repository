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
import com.dms.dao.DocotorDAO;

@RestController
@CrossOrigin("http://localhost:4200")
public class DMSController {
	
	@Autowired
	DocotorDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Doctor doc) {
		dao.save(doc);
	}
	
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Doctor doc) {
		dao.save(doc);
	}
	
	@DeleteMapping("/PerformDelete/{doctorId}")
	public void performDelete(@PathVariable("doctorId") int doctorId) {
		dao.deleteById(doctorId);
	}
	
	@GetMapping("/ViewAll")
	public List<Doctor> getAllDoctorDetails(){
		Iterator<Doctor> it=dao.findAll().iterator();
		ArrayList<Doctor> list=new ArrayList<>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
