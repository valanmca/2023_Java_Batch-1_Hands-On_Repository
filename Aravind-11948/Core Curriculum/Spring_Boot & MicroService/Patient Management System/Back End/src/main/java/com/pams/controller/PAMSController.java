package com.pams.controller;

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

import com.pams.bean.Patient;
import com.pams.dao.PatientDAO;




@RestController
@CrossOrigin("http://localhost:50833/")
public class PAMSController {
	
	
	
	@Autowired
	PatientDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Patient doc)
	{
		dao.save(doc);
	}
	
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Patient doc)
	{
		dao.save(doc);
	}
	
	@DeleteMapping ("/PerformDelete/{id}")
	public void performDelete(@PathVariable ("id") int id)
	{
		dao.deleteById(id);
	}
	
	
	@GetMapping("/ViewAll")
	public List<Patient> viewAllPatient()
	{
		Iterator<Patient> it=dao.findAll().iterator();
		ArrayList<Patient> list=new ArrayList<Patient>();
		while(it.hasNext())
		{
			list.add(it.next());
		}
		return list;
		
	}

}
