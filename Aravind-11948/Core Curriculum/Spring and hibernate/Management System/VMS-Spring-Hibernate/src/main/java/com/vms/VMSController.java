package com.vms;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


import com.vms.bean.Vehicle;
import com.vms.dao.VehicleDAO;

@Controller
public class VMSController {

	@Autowired
	VehicleDAO dao;
	
	
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

	@RequestMapping("InsertVehicle")
	public ModelAndView locatevehicle()
	{
		ModelAndView mv= new ModelAndView("InsertVehicle");
		return mv;
	}
	
	
	
	
	
	
	@RequestMapping("PerformInsert")
	public ModelAndView persormInsert(@ModelAttribute("bean") Vehicle bean)
	{
		ModelAndView mv=new ModelAndView();
		try {
			dao.insertVehicle(bean);
			mv.setViewName("InsertVehicleSuccess");
			
		}catch(Exception e)
		{
			mv.setViewName("InsertVehicleFail");
			
		}
		return mv;
	}
	
	
	
	
	
	@RequestMapping("DeleteVehicle")
	public ModelAndView locateDelete()
	
	{
		List<Vehicle> list=dao.getIdList();
		ModelAndView mv= new ModelAndView("DeleteVehicle");
		mv.addObject("msg1",list);
		return mv;
	}
	
	

	@RequestMapping("PerformDelete")
	public ModelAndView persormDelete(@ModelAttribute("bean") Vehicle bean)
	{
		ModelAndView mv=new ModelAndView();
		
			dao.deleteVehicle(bean);
			mv.setViewName("DeleteVehicleSuccess");
			
		
		return mv;
	}
	
	@RequestMapping("UpdateVehicle")
	public ModelAndView locateUpdate()
	{
		ModelAndView mv= new ModelAndView("UpdateVehicle");
		return mv;
	}
	
	
	
	
	@RequestMapping("PerformUpdate")
	public ModelAndView persormUpdate(@ModelAttribute("bean") Vehicle bean)
	{
		ModelAndView mv=new ModelAndView();
		try {
			dao.updateVehicle(bean);
			mv.setViewName("UpdateVehicleSuccess");
			
		}catch(Exception e)
		{
			mv.setViewName("UpdateVehicleFail");
			
		}
		return mv;
	}
	
	
	
	@RequestMapping("FindVehicle")
	public ModelAndView locateFind()
	
	{
		List<Vehicle> list=dao.getIdList();
		ModelAndView mv= new ModelAndView("FindVehicle");
		mv.addObject("msg1",list);
		return mv;
	}
	
	@RequestMapping("PerformFind")
	public ModelAndView performFind (@ModelAttribute("bean") Vehicle bean)
	{
		Vehicle pro=dao.findVehicle(bean);
		ModelAndView mv=new ModelAndView("FindVehicleSuccess");
		mv.addObject("list",pro);
		return mv;
	}
	
	@RequestMapping("FindAllVehicleSuccess")
	public ModelAndView locatefindAll()
	{
		List<Vehicle> list=dao.getAllList();
		ModelAndView mv= new ModelAndView("FindAllVehicleSuccess");
		mv.addObject("msg",list);
		return mv;
	}
	
	
}
