package com.pms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pms.bean.Product;
import com.pms.dao.ProductDAO;

@Controller
public class PMSController {
	@Autowired
	ProductDAO dao;
	
	@RequestMapping("Welcome")
	public ModelAndView locateWelcome()
	{
		ModelAndView mv= new ModelAndView("Welcome");
		return mv;
	}
	
	
	@RequestMapping("Links")
	public ModelAndView locateLinks()
	{
		ModelAndView mv= new ModelAndView("Links");
		return mv;
	}
	
	@RequestMapping("Home")
	public ModelAndView locateHome()
	{
		ModelAndView mv= new ModelAndView("Home");
		return mv;
	}
	
	
	
	@RequestMapping("InsertProduct")
	public ModelAndView locateInsert()
	{
		ModelAndView mv= new ModelAndView("InsertProduct");
		return mv;
	}
	
	
	@RequestMapping("PerformInsert")
	public ModelAndView persormInsert(@ModelAttribute("bean") Product bean)
	{
		ModelAndView mv=new ModelAndView();
		try {
			dao.insertProduct(bean);
			mv.setViewName("InsertProductSuccess");
			
		}catch(Exception e)
		{
			mv.setViewName("InsertProductFail");
			
		}
		return mv;
	}
	
	@RequestMapping("FindProduct")
	public ModelAndView locateFind()
	
	{
		List<Product> list=dao.getIdList();
		ModelAndView mv= new ModelAndView("FindProduct");
		mv.addObject("msg1",list);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView performFind (@ModelAttribute("bean") Product bean)
	{
		Product pro=dao.findProduct(bean);
		ModelAndView mv=new ModelAndView("FindProductSuccess");
		mv.addObject("list",pro);
		return mv;
	}
	
	
	
	
	@RequestMapping("DeleteProduct")
	public ModelAndView locateDelete()
	
	{
		List<Product> list=dao.getIdList();
		ModelAndView mv= new ModelAndView("DeleteProduct");
		mv.addObject("msg1",list);
		return mv;
	}
	
	

	@RequestMapping("PerformDelete")
	public ModelAndView persormDelete(@ModelAttribute("bean") Product bean)
	{
		ModelAndView mv=new ModelAndView();
		
			dao.deleteProduct(bean);
			mv.setViewName("DeleteProductSuccess");
			
		
		return mv;
	}
	
	
	
	@RequestMapping("UpdateProduct")
	public ModelAndView locateUpdate()
	{
		ModelAndView mv= new ModelAndView("UpdateProduct");
		return mv;
	}
	
	@RequestMapping("PerformUpdate")
	public ModelAndView persormUpdate(@ModelAttribute("bean") Product bean)
	{
		ModelAndView mv=new ModelAndView();
		try {
			dao.updateProduct(bean);
			mv.setViewName("UpdateProductSuccess");
			
		}catch(Exception e)
		{
			mv.setViewName("UpdateProductFail");
			
		}
		return mv;
	}
	
	
	
	@RequestMapping("FindAllProductSuccess")
	public ModelAndView locatefindAll()
	{
		List<Product> list=dao.getAllList();
		ModelAndView mv= new ModelAndView("FindAllProductSuccess");
		mv.addObject("msg",list);
		return mv;
	}
}
