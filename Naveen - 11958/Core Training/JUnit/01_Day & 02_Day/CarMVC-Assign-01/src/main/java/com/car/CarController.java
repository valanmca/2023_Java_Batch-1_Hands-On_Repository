package com.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.car.bean.Car;
import com.car.dao.CarDAO;

@Controller
public class CarController {
	
	@Autowired
	CarDAO dao;
	
	@RequestMapping("Register")
	public ModelAndView loadRegister() {
		ModelAndView mv = new ModelAndView("Register");
		return mv;
	}
	
	@RequestMapping("PerformRegister")
	public ModelAndView performInsert(@ModelAttribute("bean") Car bean) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.insert(bean);
			mv.setViewName("RegisterSuccess");

		} catch (Exception e) {
			mv.setViewName("RegisterFail");
		}
		return mv;

	}
	
	
	
}
