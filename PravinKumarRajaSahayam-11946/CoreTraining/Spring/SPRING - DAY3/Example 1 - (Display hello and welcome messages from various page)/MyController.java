package com.spring;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class MyController {
	//Internally it is request dispatcher
	@RequestMapping("Welcome")
	public ModelAndView sayWelcome() 
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");
		return mv;
	}
	@RequestMapping("Hello")
	public ModelAndView sayHello() 
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}
	@RequestMapping("Calculator")
	public ModelAndView sayCalculator()
	{
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Calculator");
		return mv;
	}
@RequestMapping("/Add")
public String Add()
{
	return "Addition";
}
@RequestMapping("/submitForm")
public ModelAndView submitForm(HttpServletRequest request,HttpServletResponse response)
{
	int num1 = Integer.parseInt(request.getParameter("number1"));
	int num2 = Integer.parseInt(request.getParameter("number2"));
	int num3 = num1 + num2;
	return new ModelAndView("Addition","res","result is" + num3);
}
}
