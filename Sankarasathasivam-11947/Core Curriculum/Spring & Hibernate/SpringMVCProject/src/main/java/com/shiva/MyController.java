package com.shiva;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.shiva.bean.Addition;

@Controller
public class MyController {

	@RequestMapping("Welcome")
	public ModelAndView SayWelcome() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Welcome");// Add prefix & Suffix - extension
		return mv;
	}

	@RequestMapping("Hello")
	public ModelAndView SayHello() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Hello");
		mv.addObject("fname", "Shiva");
		return mv;
	}

	@RequestMapping("Calc")
	public ModelAndView sum() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("Calc");
		return mv;
	}

	@RequestMapping("Input")
	public ModelAndView callInputPage() {
		ModelAndView mv = new ModelAndView("Input");
		return mv;
	}

	@RequestMapping("Add")
	public ModelAndView performAdd(@ModelAttribute("addition") Addition addition) {
		ModelAndView mv = new ModelAndView("Sumsuccess");
//		int sum = addition.getNum1()+addition.getNum2();
//		mv.addObject("sum", sum);

		mv.addObject("bean", addition);
		return mv;

	}

	@RequestMapping("Addition")
	public String sumTwoValue(HttpServletRequest request, Model m) {
		int result = 0;
		int num1 = Integer.parseInt(request.getParameter("num1"));
		int num2 = Integer.parseInt(request.getParameter("num2"));

		String output = request.getParameter("button");
		if (output.equals("Addition")) {
			result = num1 + num2;
		}
		m.addAttribute("msg", result);
		return "Sumsuccess";

	}

//	@RequestMapping("/addlogic")
//    public ModelAndView addlogic(HttpServletRequest request,HttpServletResponse response)
//    {
//        int a = Integer.parseInt(request.getParameter("txtnum1"));
//        int b = Integer.parseInt(request.getParameter("txtnum2"));
//        int c = a+b;
//        return new ModelAndView("addition","res","result is "+c);
//    }

}
