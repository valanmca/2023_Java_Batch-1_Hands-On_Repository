package com.ems.controller;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("LandingPage");
//		return mv;
//	}
//
//	@RequestMapping("/Links")
//	public ModelAndView loadLinksPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("Links");
//		return mv;
//	}
//
//	@RequestMapping("/InsertEmployee")
//	public ModelAndView loadInsertEmployeePage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("InsertEmployee");
//		return mv;
//	}
//	@RequestMapping("/PerformInsert")
//	public ModelAndView performInsert(Employee emp) {
//		ModelAndView mv = new ModelAndView();
//		dao.save(emp);
//		mv.setViewName("InsertEmployeeSuccess");
//		mv.addObject("bean", emp);
//		return mv;
//	}
	
	@PostMapping("PerformInsert")
	public void performInsert(@RequestBody Employee emp) {
		dao.save(emp);
	}
	
	@PutMapping("PerformUpdate")
	public void performUpdate(@RequestBody Employee emp) {
		dao.save(emp);
	}
	@DeleteMapping("PerformDelete/{id}")
	public void performDelete(@PathVariable("id") int id) {
		dao.deleteById(id);
	}
	
	@GetMapping("ViewAll")
	public List<Employee> viewAllEmployee(){
		Iterator<Employee> it=dao.findAll().iterator();
		 List<Employee> list=new ArrayList<Employee>();
	        while (it.hasNext()) {
	            list.add(it.next());
	        }
	        return list;
	}
	
//	@GetMapping("FindAllEmployee")
//    public List<Employee> getAllEmployee() {
//        Iterator<Employee> it=dao.findAll().iterator();
//        ArrayList<Employee> list=new ArrayList<Employee>();
//        while(it.hasNext()) {
//            list.add(it.next());
//        }
//        return list;
//    }
//	@RequestMapping("/UpdateEmployee")
//	public ModelAndView loadUpdateEmployeePage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("UpdateEmployee");
//		return mv;
//	}
//
//	@RequestMapping("/PerformUpdate")
//	public ModelAndView performUpdate(Employee std) {
//		ModelAndView mv = new ModelAndView();
//		dao.save(std);
//		mv.setViewName("UpdateEmployeeSuccess");
//		mv.addObject("bean", std);
//		return mv;
//	}
//	
//	@RequestMapping("/DeleteEmployee")
//	public ModelAndView loadDeleteEmployeePage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("DeleteEmployee");
//		return mv;
//	}
//
//	@RequestMapping("/PerformDelete")
//	public ModelAndView performDelete(Employee std) {
//		ModelAndView mv = new ModelAndView();
//		dao.delete(std);
//		mv.setViewName("DeleteEmployeeSuccess");
//		mv.addObject("bean", std);
//		return mv;
//	}
//	
//	@RequestMapping("/FindEmployee")
//	public ModelAndView loadFindEmployeePage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("FindEmployee");
//		return mv;
//	}
//
//	@RequestMapping("/PerformFind")
//	public ModelAndView performFind(int id) {
//		ModelAndView mv = new ModelAndView();
//		Employee emp = dao.findById(id).get();
//		mv.setViewName("FindEmployeeSuccess");
//		mv.addObject("bean", emp);
//		return mv;
//	}
//	
//	@RequestMapping("FindAllEmployee")
//    public ModelAndView loadFindEmployee() {
//        Iterator<Employee> it =  dao.findAll().iterator();
//        
//        String temp = "";
//        while(it.hasNext()) {
//            Employee e = it.next();
//            temp += "<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>";
//        }
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("temp",temp);
//        mv.setViewName("FindAllEmployee");
//        return mv;
//    }
	
}
