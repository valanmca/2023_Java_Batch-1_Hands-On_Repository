package com.matthew;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.matthew.bean.Employee;
import com.matthew.bean.Multiplication;

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
		return mv;
	}
	
	@RequestMapping("Calculator")
	public ModelAndView calculator(){
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Calculator");
		return mv;
	}
		
	
	@RequestMapping("Logic")
	public String display(HttpServletRequest req,Model m) {
		int n1= Integer.parseInt(req.getParameter("num1"));
		int n2= Integer.parseInt(req.getParameter("num2"));
		int value =0;
		String Operation = req.getParameter("button");
		if(Operation.equals("Addition")) {
			value = n1+n2;
		}
		
		if(Operation.equals("Subtraction")) {
			value = n1-n2;
		}
		
		m.addAttribute("msg", value);
		return "Result";
	}
	
	@RequestMapping("Input")
	public ModelAndView callInputPage(){
		ModelAndView mv = new ModelAndView("Input");//view name("Input")
		return mv;
	}
	
	@RequestMapping("Multiplication")
	public ModelAndView performMultiplication(@ModelAttribute("multiplication") Multiplication multiplication){
		
		//int mul = multiplication.getN1()*multiplication.getN2();
		ModelAndView mv = new ModelAndView("Result");//view name("Input")
		mv.addObject("bean",multiplication);
		return mv;
	}
	
	@RequestMapping("EmployeeInput")
	public ModelAndView callEmployeeInputPage(){
		ModelAndView mv = new ModelAndView("EmployeeInput");//view name("Input")
		return mv;
	}
	
	@RequestMapping("AddEmployee")
	public ModelAndView AddEmployee(@ModelAttribute("employee") Employee employee){
		ModelAndView mv = new ModelAndView("EmployeeResult");
		mv.addObject("emp",employee);
		return mv;
	}
}
