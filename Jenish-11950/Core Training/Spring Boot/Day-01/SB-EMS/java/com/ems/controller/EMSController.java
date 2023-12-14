package com.ems.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

@RestController
@CrossOrigin("http://localhost:4200/")
public class EMSController {

	@Autowired
	EmployeeDAO dao;
	
	// Insert in SB with Angular Intergration
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Employee emp) {
		dao.save(emp);
	}

	// Update in SB with Angular Intergration
	@PutMapping("/PerformUpdate")
	public void performUpdate(@RequestBody Employee emp) {
		dao.save(emp);
	}
	
	// Delete in SB with Angular Intergration
	@DeleteMapping("/PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}
	
	@GetMapping("/ViewAll")
	public List<Employee> getAllEmployee() {
		System.out.println("Inside ViewAll");
		Iterator <Employee> it = dao.findAll().iterator();
		ArrayList<Employee> list = new ArrayList<Employee>();
		while(it.hasNext()){
			list.add(it.next());
		}
		return list;
	}
}

	/*@RequestMapping("/UpdateEmployee")
	public ModelAndView loadupdateEmployeePage() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("UpdateEmployee");
		return mv;
	}

	@RequestMapping("/PerformUpdate")
	public ModelAndView performUpdate(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.save(emp);
		mv.setViewName("UpdateEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}

	@RequestMapping("/DeleteEmployee")
	public ModelAndView loadDeleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		return mv;
	}

	@RequestMapping("/PerformDelete")
	public ModelAndView loadPerformDeleteSuccess(Employee emp) {
		ModelAndView mv = new ModelAndView();
		dao.delete(emp);
		mv.setViewName("DeleteEmployeeSuccess");
		mv.addObject("bean", emp);
		return mv;
	}

	@RequestMapping("FindEmployee")
	public ModelAndView loadFindEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployee");
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView loadPerformFind(int id) {

		Employee bean = dao.findById(id).get();
		ModelAndView mv = new ModelAndView("FindEmployeeSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindAllEmployee")
	public ModelAndView loadFindAllEmployee() {
		Iterator<Employee> it = dao.findAll().iterator();

		String temp = "";
		while (it.hasNext()) {
			Employee e = it.next();
			temp += "<tr><td>" + e.getId() + "</td><td>" + e.getName() + "</td><td>" + e.getSalary() + "</td></tr>";
		}
		ModelAndView mv = new ModelAndView();
		mv.addObject("temp", temp);
		mv.setViewName("FindAllEmployee");
		return mv;
	}
	}*/


