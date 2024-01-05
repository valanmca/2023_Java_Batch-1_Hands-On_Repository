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
	
	@RequestMapping("Head")
	public ModelAndView loadHead() {
		ModelAndView mv = new ModelAndView();
		return mv;
	}
	
	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv=new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("InsertLaptop")
	public ModelAndView loadInsertLaptop() {
		ModelAndView mv = new ModelAndView("InsertLaptop");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Laptop bean) {
		dao.insertLaptop(bean);
		ModelAndView mv = new ModelAndView("InsertLaptopSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("UpdateLaptop")
	public ModelAndView loadUpdateLaptop() {
		ModelAndView mv = new ModelAndView("UpdateLaptop");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Laptop bean) {
		dao.updateLaptop(bean);
		ModelAndView mv = new ModelAndView("UpdateLaptopSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("DeleteLaptop")
	public ModelAndView loadDeleteLaptop() {
		List<Integer> idList = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteLaptop");
		mv.addObject("idList", idList);
		return mv;
	}
	
	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Laptop bean) {
		dao.deleteLaptop(bean);
		ModelAndView mv = new ModelAndView("DeleteLaptopSuccess");
		mv.addObject("bean",bean);
		return mv;
	}
	
	@RequestMapping("FindLaptop")
	public ModelAndView loadFindLaptop() {
		List<Integer> idList = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindLaptop");
		mv.addObject("idList", idList);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Laptop bean) {
		Laptop lap = dao.findLaptop(bean);
		ModelAndView mv = new ModelAndView("FindLaptopSuccess");
		mv.addObject("lap",lap);
		return mv;
	}
	
	@RequestMapping("FindAllLaptop")
	public ModelAndView loadFindAllLaptop() {
		List<Laptop> lList = dao.viewAllLaptop();
		ModelAndView mv = new ModelAndView("FindAllLaptop");
		mv.addObject("lList", lList);
		return mv;
	}
}
