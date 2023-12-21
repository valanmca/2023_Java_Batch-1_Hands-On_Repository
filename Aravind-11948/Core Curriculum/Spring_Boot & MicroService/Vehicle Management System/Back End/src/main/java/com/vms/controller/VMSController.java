package com.vms.controller;

import java.util.ArrayList;
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

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

@RestController
@CrossOrigin("http://localhost:57353/")
public class VMSController {
	
	@Autowired
	VehicleDAO dao;
	
	@PostMapping("/PerformInsert")
	public void insert(@RequestBody Vehicle veh)
	{
		dao.save(veh);
	}
	
	
	@PutMapping("/PerformUpdate")
	public void update(@RequestBody Vehicle veh)
	{
		dao.save(veh);
	}
	
	@DeleteMapping("/PerformDelete/{id}")
	
		public void delete(@PathVariable ("id") int id)
		{
			dao.deleteById(id);
		}
	
	
	@GetMapping("/ViewAll")
	public ArrayList<Vehicle> getalldetails()
	{
		Iterator<Vehicle> it=dao.findAll().iterator();
		
		ArrayList<Vehicle> list= new ArrayList<Vehicle>();
		while(it.hasNext())
		{
			list.add(it.next());
		}
		return list;
	}
	

}
