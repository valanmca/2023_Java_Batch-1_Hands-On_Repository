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
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@RequestMapping("Welcome")
	public ModelAndView loadWelcome() {
		ModelAndView mv = new ModelAndView("Welcome");
		return mv;
	}

	@RequestMapping("Navbar")
	public ModelAndView loadNavbar() {
		ModelAndView mv = new ModelAndView("Navbar");
		return mv;
	}

	@RequestMapping("InsertLaptop")
	public ModelAndView loadInsertLaptop() {
		ModelAndView mv = new ModelAndView("InsertLaptop");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsertLapotop(@ModelAttribute("bean") Laptop bean) {
		dao.insertLaptop(bean);
		ModelAndView mv = new ModelAndView("InsertLaptopSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
	
	@RequestMapping("UpdateLaptop")
	public ModelAndView loadUpdateLaptop() {
		ModelAndView mv = new ModelAndView("UpdateLaptop");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdateLaptop(@ModelAttribute("bean") Laptop bean) {
		dao.updateLaptop(bean);
		ModelAndView mv = new ModelAndView("UpdateLaptopSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("DeleteLaptop")
	public ModelAndView loadDeleteLaptop() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteLaptop");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDeleteLaptop(@ModelAttribute("bean") Laptop bean) {
		dao.deleteLaptop(bean);
		ModelAndView mv = new ModelAndView("DeleteLaptopSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindLaptop")
	public ModelAndView loadFindLaptop() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindLaptop");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFindLaptop(@ModelAttribute("bean") Laptop bean) {
		Laptop laptop = dao.findLaptop(bean);
		ModelAndView mv = new ModelAndView("FindLaptopSuccess");
		mv.addObject("bean", laptop);
		return mv;
	}

	@RequestMapping("FindAllLaptops")
	public ModelAndView loadFindAllLaptops() {
		List<Laptop> laptopList = dao.getLaptopList();

		ModelAndView mv = new ModelAndView("FindAllLaptops");
		mv.addObject("laptopList", laptopList);
		return mv;
	}

}
