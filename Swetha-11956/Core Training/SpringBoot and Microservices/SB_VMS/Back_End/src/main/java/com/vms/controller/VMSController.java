package com.vms.controller;

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

import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;



@RestController
@CrossOrigin("http://localhost:4200/")
public class VMSController {
	
	@Autowired
	VehicleDAO dao;
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Vehicle vec) {
		dao.save(vec);
	}
	
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Vehicle veh) {
		dao.save(veh);
	}
	
	@DeleteMapping("/PerformDelete/{vno}")
	public void performDelete(@PathVariable("vno") int vno) {
		dao.deleteById(vno);
	}
	
	@GetMapping("/View")
	public List<Vehicle> getAllVehicle(){
		Iterator<Vehicle> it=dao.findAll().iterator();
		List<Vehicle> list = new ArrayList<Vehicle>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}

}
