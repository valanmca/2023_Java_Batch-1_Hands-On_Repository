package com.lsms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lsms.bean.Laptop;
import com.lsms.dao.LaptopDAO;

@Controller
public class LSMSController {
	
	@Autowired
	LaptopDAO dao;
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("Navbar")
	public ModelAndView loadNavbar() {
		ModelAndView mv=new ModelAndView("Navbar");
		return mv;
	}
	
	@RequestMapping("Welcome")
	public ModelAndView loadWelcome() {
		ModelAndView mv=new ModelAndView("Welcome");
		return mv;
	}
	
	@RequestMapping("InsertLaptop")
	public ModelAndView loadInsertLaptop() {
		ModelAndView mv=new ModelAndView("InsertLaptop");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Laptop bean) {
		ModelAndView mv=new ModelAndView();
		try {
		dao.insertLaptop(bean);
		mv.addObject("bean",bean);
		mv.setViewName("InsertLaptopSuccess");
		} catch(Exception e) {
			mv.setViewName("InsertLaptopFail");
		}
		return mv;
	}
	
	@RequestMapping("DeleteLaptop")
	public ModelAndView loadDeleteLaptop() {
		List<Integer> idList=dao.getIdList();
		ModelAndView mv=new ModelAndView("DeleteLaptop");
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Laptop bean) {
		ModelAndView mv=new ModelAndView();
		try {
		dao.deleteLaptop(bean);;
		mv.setViewName("DeleteLaptopSuccess");
		mv.addObject("bean",bean);
		} catch(Exception e) {
			mv.setViewName("DeleteLaptopFail");
		}
		return mv;
	}
	
	@RequestMapping("UpdateLaptop")
	public ModelAndView loadUpdateLaptop() {
		ModelAndView mv=new ModelAndView("UpdateLaptop");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Laptop bean) {
		ModelAndView mv=new ModelAndView();
		try {
		dao.updateLaptop(bean);
		mv.setViewName("UpdateLaptopSuccess");
		mv.addObject("bean",bean);
		} catch(Exception e) {
			mv.setViewName("UpdateLaptopFail");
		}
		return mv;
	}
	
	@RequestMapping("FindLaptop")
	public ModelAndView loadFindLaptop() {
		List<Integer> idList=dao.getIdList();
		ModelAndView mv=new ModelAndView("FindLaptop");
		mv.addObject("idList",idList);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Laptop bean) {
		ModelAndView mv=new ModelAndView();
		try {
		Laptop lap=dao.findLaptop(bean);;
		mv.setViewName("FindLaptopSuccess");
		mv.addObject("bean",lap);
		} catch(Exception e) {
			mv.setViewName("FindLaptopFail");
		}
		return mv;
	}
	
	@RequestMapping("ViewAllLaptop")
	public ModelAndView loadViewAllLaptop() {
		List<Laptop> lapList=dao.getAllLaptop();
		ModelAndView mv=new ModelAndView("ViewAllLaptop");
		mv.addObject("lapList",lapList);
		return mv;
	}

}
