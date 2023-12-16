package com.pms.controller;
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
import com.pms.dao.PatientDAO;
import com.pms.bean.Patient;
@RestController
@CrossOrigin("http://localhost:4200/")
public class PMSController {
	
	@Autowired
	PatientDAO dao;

	
	@PostMapping("/PerformInsert")
    public void performInsert(@RequestBody  Patient pms) {
        dao.save(pms);  
    }
	

@PutMapping("/PerformUpdate")
public void performUpdate(@RequestBody Patient pms) {
    dao.save(pms);  
}


@DeleteMapping("/PerformDelete/{id}")
public void performDelete(@PathVariable("id") int id) {
    dao.deleteById(id);  
}
@GetMapping("/viewAll")
public List<Patient> getAllPatient() {
	System.out.println("Inside view All");
    Iterator<Patient> it=dao.findAll().iterator();
    List<Patient> list=new ArrayList<Patient>();
    while(it.hasNext()) {
    	list.add(it.next());
    }
	return list;  
}
}
