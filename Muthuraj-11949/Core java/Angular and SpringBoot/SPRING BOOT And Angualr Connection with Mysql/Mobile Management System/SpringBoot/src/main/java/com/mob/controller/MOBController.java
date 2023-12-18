package com.mob.controller;
import java.io.IOException;
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
import com.mob.bean.Mobile;
import com.mob.dao.MobileDAO;
@RestController
@CrossOrigin("http://localhost:55374/")
public class MOBController {
	@Autowired
	MobileDAO dao;

	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Mobile mob) {
		dao.save(mob);
	}

	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Mobile mob) {
		dao.save(mob);
	}

	@DeleteMapping("/PerformDelete/{mobID}")
	public void performDelete(@PathVariable("mobID") int id) {
		dao.deleteById(id);
	}

	@GetMapping("/viewAll")
	public List<Mobile> getAllMobile() {
		System.out.println("Inside view All");
		Iterator<Mobile> it = dao.findAll().iterator();
		List<Mobile> list = new ArrayList<Mobile>();
		while (it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
}
