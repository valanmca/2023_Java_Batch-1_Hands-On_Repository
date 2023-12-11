package com.aravind;

import java.net.http.HttpRequest;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.aravind.bean.Addition;
import com.aravind.bean.Employee;

@Controller
public class MyController {

	@RequestMapping("Welcome")
	public ModelAndView sayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");

		return mv;
	}

	@RequestMapping("Hello")
	public ModelAndView sayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		mv.addObject("fname", "Aravind");
		return mv;
	}

	@RequestMapping("Calculator")
	public ModelAndView Calculator() {
		ModelAndView mv = new ModelAndView("Calculator");// way 1
		// mv.setViewName("Calculator"); // way2
		return mv;
	}

	//Calculator logic way1
	
//	@RequestMapping("Cal")
	
//	public String display(HttpServletRequest req, Model m) {
//
//		int value = 0;
//
//		String operation = req.getParameter("button");
//
//		if (operation.equals("Addition")) {
//			int a = Integer.parseInt(req.getParameter("num1"));
//			int b = Integer.parseInt(req.getParameter("num2"));
//			value = a + b;
//			System.out.println(value);
//			m.addAttribute("msg", value);
//
//			return ("Result");
//
//		}
//
//		else {
//			int a = Integer.parseInt(req.getParameter("num1"));
//			int b = Integer.parseInt(req.getParameter("num2"));
//			value = a - b;
//			System.out.println(value);
//			m.addAttribute("msg", value);
//
//			return ("Result");
//
//		}
//
//	}
	
	//Calculator logic way2 easy way :
	
	@RequestMapping("Addition")
	public ModelAndView Calculatorpage(@ModelAttribute("addition") Addition addition) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Result");
//		int sum=addition.getNum1()+addition.getNum2();
		
		mv.addObject("bean",addition);

		return mv;
	}
	
	@RequestMapping("EmployeeInput")
	public ModelAndView CallEmployee() {
		ModelAndView mv = new ModelAndView("EmployeeInput");// way 1
		// mv.setViewName("Calculator"); // way2
		return mv;
	}
	
	@RequestMapping("AddEmployee")
	public ModelAndView AddEmployee(@ModelAttribute("employee") Employee employee) {
		ModelAndView mv = new ModelAndView("EmployeeResult");
		mv.addObject("emp",employee);
		return mv;
	}
	
	

}
