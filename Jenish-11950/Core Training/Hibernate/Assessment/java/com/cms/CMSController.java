package com.cms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cms.bean.Customer;
import com.cms.dao.CustomerDAO;


@Controller

public class CMSController {
	
	@Autowired
	CustomerDAO dao;
	
	@RequestMapping("header")
	public ModelAndView loadheader() {
		ModelAndView mv = new ModelAndView("header");
		return mv;
	}

	@RequestMapping("left")
	public ModelAndView loadleft() {
		ModelAndView mv = new ModelAndView("left");
		return mv;
	}

	@RequestMapping("right")
	public ModelAndView loadright() {
		ModelAndView mv = new ModelAndView("right");
		return mv;
	}
	
	@RequestMapping("InsertCustomer")
	public ModelAndView loadInsertCustomer() {
		ModelAndView mv = new ModelAndView("InsertCustomer");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Customer bean) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.insertCustomer(bean);
			mv.setViewName("InsertCustomerSuccess");
		} catch (Exception e) {
			mv.setViewName("InsertCustomerFail");
		}
		return mv;
	}
	
	@RequestMapping("DeleteCustomer")
	public ModelAndView loadDeleteCustomer() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteCustomer");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Customer  bean) {

		dao.deleteCustomer(bean);

		ModelAndView mv = new ModelAndView("DeleteCustomerSuccess");
		mv.addObject("bean", bean);
		return mv;
	}
	
	@RequestMapping("UpdateCustomer")
	public ModelAndView loadUpdateCustomer() {
		ModelAndView mv = new ModelAndView("UpdateCustomer");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Customer bean) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.updateCustomer(bean);
			mv.setViewName("UpdateCustomerSuccess");
		} catch (Exception e) {
			mv.setViewName("UpdateCustomerFail");
		}
		return mv;
	}
	@RequestMapping("FindCustomer")
	public ModelAndView loadFindCustomer() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindCustomer");
		mv.addObject("idList", list);
		return mv;
	}
	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Customer bean) {

		Customer cus = dao.findCustomer(bean);

		ModelAndView mv = new ModelAndView("FindCustomerSuccess");
		mv.addObject("cus", cus);
		return mv;
	}
	
	@RequestMapping("FindAllCustomer")
	public ModelAndView loadFindAllMobile() {
		List<Customer> cusList = dao.getCustomer();
		ModelAndView mv = new ModelAndView("FindAllCustomer");
		mv.addObject("idList", cusList);
		return mv;
	}


}
