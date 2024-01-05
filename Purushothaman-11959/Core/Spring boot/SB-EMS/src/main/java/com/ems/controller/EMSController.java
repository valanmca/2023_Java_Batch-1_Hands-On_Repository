package com.ems.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.Optional;

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
@CrossOrigin("http://localhost:4200")
public class EMSController {
	
	@Autowired
	EmployeeDAO dao;
	
//	@RequestMapping("/Start")
//	public ModelAndView loadLandingPage() {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("LandingPage");
//		return mv;
//	}
//	
//	@RequestMapping("/Links")
//	public ModelAndView loadLinksPage() {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("Links");
//		return mv;
//	}
//	
//	@RequestMapping("/InsertEmployee")
//	public ModelAndView loadInsertEmployeePage() {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("InsertEmployee");
//		return mv;
//	}
	
	@PostMapping("/PerformInsert")
	public void performInsert(@RequestBody Employee emp) {
		dao.save(emp);
	}
	
//	@RequestMapping("/UpdateEmployee")
//	public ModelAndView loadUpdateEmployeePage() {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("UpdateEmployee");
//		return mv;
//	}
	
	@PutMapping("/PerformUpdate")
	public void PerformUpdate(@RequestBody Employee emp) {
		dao.save(emp);
	}
	
//	@RequestMapping("DeleteEmployee")
//	public ModelAndView loadDeleteEmployee(Employee emp) {
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("DeleteEmployee");
//		return mv;
//	}
	
	@DeleteMapping("PerformDelete/{eid}")
	public void perfromDelete(@PathVariable("eid") int eid) {
		dao.deleteById(eid);
	}
	
	@GetMapping("ViewAll")
	public List<Employee> getAllEmployee() {
		Iterator<Employee> it=dao.findAll().iterator();
		ArrayList<Employee> list=new ArrayList<Employee>();
		while(it.hasNext()) {
			list.add(it.next());
		}
		return list;
	}
	
	@RequestMapping("FindEmployee")
	public ModelAndView loadFindEmployee(Employee emp) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("FindEmployee");
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView perfromFind(int eid) {
		Employee emp = dao.findById(eid).get();
		ModelAndView mv=new ModelAndView("FindEmployeeSuccess");
		mv.addObject("emp",emp);
		return mv;
	}
	
	@RequestMapping("FindAllEmployee")
	public ModelAndView loadFindEmployee() {
		Iterator<Employee> it =  dao.findAll().iterator();
		
		String temp = "";
		while(it.hasNext()) {
			Employee e = it.next();
			temp += "<tr><td>"+e.getEid()+"</td><td>"+e.getEname()+"</td><td>"+e.getEsalary()+"</td></tr>";
		}
		ModelAndView mv=new ModelAndView();
		mv.addObject("temp",temp);
		mv.setViewName("FindAllEmployee");
		return mv;
	}

	@RequestMapping("FindEmployeeByName")
	public ModelAndView loadFindEmployeeByName(Employee emp) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("FindEmployeeByName");
		return mv;
	}
	
	@RequestMapping("PerformFindByName")
	public ModelAndView perfromFindByName(String ename) {
		Employee emp = dao.findByEname(ename);
		ModelAndView mv=new ModelAndView("FindEmployeeSuccess");
		mv.addObject("emp",emp);
		return mv;
	}
}
