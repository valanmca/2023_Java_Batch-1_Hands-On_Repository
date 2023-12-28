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

	// Insert in SB with Angular Intergration
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Vehicle vec) {
		dao.save(vec);
	}

	// Update in SB with Angular Intergration
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Vehicle vec) {
		dao.save(vec);
	}

	// Delete in SB with Angular Intergration
	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}

	@GetMapping("/ViewAll")
	public List<Vehicle> getAllVehicle() {
		System.out.println("Inside ViewAll");
		Iterator<Vehicle> it = dao.findAll().iterator();
		ArrayList<Vehicle> list = new ArrayList<Vehicle>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
