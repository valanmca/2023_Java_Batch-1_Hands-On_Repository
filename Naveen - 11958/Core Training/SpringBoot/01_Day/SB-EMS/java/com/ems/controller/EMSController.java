package com.ems.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

@Controller
public class EMSController {

	@Autowired
	EmployeeDAO dao;
	
	@RequestMapping("/Start")
	public ModelAndView loadLandingPage() {
		ModelAndView mv = new ModelAndView("LandingPage");
		return mv;
	}

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@RequestMapping("InsertEmployee")
	public ModelAndView loadInsertEmployee() {
		ModelAndView mv = new ModelAndView("InsertEmployee");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(Employee bean) {
		ModelAndView mv = new ModelAndView();
		dao.save(bean);
		mv.setViewName("InsertEmployeeSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
	
	

	@RequestMapping("DeleteEmployee")
	public ModelAndView loadDeleteEmployee() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("DeleteEmployee");
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView loadPerformDeleteSuccess(Employee bean) {
		ModelAndView mv = new ModelAndView();
		dao.delete(bean);
		
		mv.setViewName("DeleteEmployeeSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("UpdateEmployee")
	public ModelAndView loadUpdateEmployee() {
		ModelAndView mv = new ModelAndView("UpdateEmployee");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(Employee bean) {

		ModelAndView mv = new ModelAndView();
		dao.save(bean);
		mv.setViewName("UpdateEmployeeSuccess");
		mv.addObject("bean", bean);
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
        ModelAndView mv=new ModelAndView("FindEmployeeSuccess");
        mv.addObject("bean",bean);
		return mv;
	}
	

	@RequestMapping("FindAllEmployee")
	public ModelAndView loadFindAllEmployee() {
		Iterator<Employee> it = dao.findAll().iterator();
		
		String temp = "";
		while(it.hasNext()) {
			Employee e = it.next();
			temp+= "<tr><td>"+e.getId()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>";
		}
		ModelAndView mv = new ModelAndView("FindAllEmployee");
		mv.addObject("temp", temp);

		return mv;
	}
	@RequestMapping("FindEmployeeByName")
	public ModelAndView loadFindEmployeeByName() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("FindEmployeeByName");
		return mv;
	}
	@RequestMapping("PerformFindByName")
	public ModelAndView loadPerformFindByName(String name) {
		
		Employee bean = dao.findByName(name);
        ModelAndView mv=new ModelAndView("FindEmployeeSuccess");
        mv.addObject("bean",bean);
		return mv;
	}

}
