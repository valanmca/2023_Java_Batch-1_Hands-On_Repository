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
@CrossOrigin("http://localhost:50405/")
public class EMSController {
	@Autowired
	EmployeeDAO dao;
	
//	@RequestMapping("/StartPage")
//	public ModelAndView loadLandingPage()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("LandingPage");
//		return mv;
//	}
//	
//	@RequestMapping("/Links")
//	public ModelAndView loadLink()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("Links");
//		return mv;
//	}
//	//Insert 
//	@RequestMapping("/InsertEmployee")
//	public ModelAndView loadinsert()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("InsertEmployee");
//		return mv;
//	}
//	
//	@RequestMapping("/PerformInsert")
//    public ModelAndView performInsert(Employee bean) {
//    ModelAndView mv=new ModelAndView() ;
//    dao.save(bean);
//    mv.setViewName("InsertEmployeeSuccess");
//    mv.addObject("bean1",bean);
//    return mv;
//    }
//	
//	
//	//Update
//	@RequestMapping("/UpdateEmployee")
//	public ModelAndView loadUpdate()
//	{
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("UpdateEmployee");
//		return mv;
//	}
//	
//	@RequestMapping("/PerformUpdate")
//    public ModelAndView performUpdate(Employee bean) {
//    ModelAndView mv=new ModelAndView() ;
//    dao.save(bean);
//    mv.setViewName("UpdateEmployeeSuccess");
//    mv.addObject("bean1",bean);
//    return mv;
//    }
//	//delete
//	
//	@RequestMapping("/DeleteEmployee")
//	public ModelAndView loadDelete()
//	{
//		
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("DeleteEmployee");
//		return mv;
//	}
//	
//	@RequestMapping("/PerformDelete")
//    public ModelAndView performdelete(Employee bean) {
//    ModelAndView mv=new ModelAndView() ;
//    dao.delete(bean);
//    mv.setViewName("DeleteEmployeeSuccess");
//    
//    return mv;
//    }
//	
//	@RequestMapping("/FindAllEmployeeSuccess")
//	public ModelAndView loadFindall()
//	{
//		
//		ModelAndView mv=new ModelAndView();
//		Iterator<Employee>itr= dao.findAll().iterator();
//		mv.addObject(itr);
//		mv.setViewName("FindAllEmployeeSuccess");
//		
//		return mv;
//	}
	
	
	@PostMapping("PerformInsert")
	public void performInsert(@RequestBody Employee bean) {
		dao.save(bean);
	}
	
	
	@PutMapping("PerformUpdate")
	public void performUpdate(@RequestBody Employee bean) {
		dao.save(bean);
	}
	
	@DeleteMapping ("/PerformDelete/{id}")
	public void performDelete(@PathVariable ("id") int id)
	{
		dao.deleteById(id);
	}
	
	@GetMapping("/ViewAll")
	public List<Employee> viewAllPatient()
	{
		Iterator<Employee> it=dao.findAll().iterator();
		ArrayList<Employee> list=new ArrayList<Employee>();
		while(it.hasNext())
		{
			list.add(it.next());
		}
		return list;
		
	}


	
	

}
