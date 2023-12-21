package com.sms.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.sms.bean.Songs;
import com.sms.dao.SongsDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class SMSController {
	
	@Autowired
	SongsDAO dao;

	@PostMapping("PerformInsert")
	public void performInsert(@RequestBody Songs song) {
		dao.save(song);
	}
	
	@PutMapping("PerformUpdate")
	public void performUpdate(@RequestBody Songs song) {
		dao.save(song);
	}
	
	@DeleteMapping("PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}
	
	@GetMapping("ViewAll")
	public List<Songs> getAllSongs(){
		Iterator<Songs> it = dao.findAll().iterator();
		List<Songs> list = new ArrayList<Songs>();
		
		while(it.hasNext()) {
			list.add(it.next());
		}
		
		return list;
	}
}
