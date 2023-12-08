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

	@RequestMapping("Top")
	public ModelAndView loadTop() {
		ModelAndView mv = new ModelAndView("Top");
		return mv;
	}

	@RequestMapping("Side")
	public ModelAndView loadSidebar() {
		ModelAndView mv = new ModelAndView("Side");
		return mv;
	}

	@RequestMapping("Home")
	public ModelAndView loadHomePage() {
		ModelAndView mv = new ModelAndView("Home");
		return mv;
	}

	@RequestMapping("InsertVehicle")
	public ModelAndView loadInsertVehiclePage() {
		ModelAndView mv = new ModelAndView("InsertVehicle");
		return mv;
	}

	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Vehicle bean) {
		ModelAndView mv = new ModelAndView();
		try {
			dao.insertVehicle(bean);
			mv.setViewName("InsertVehicleSuccess");

		} catch (Exception e) {
			mv.setViewName("InsertVehicleFail");

		}
		return mv;

	}

	@RequestMapping("DeleteVehicle")
	public ModelAndView loadDeleteVehicle() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("DeleteVehicle");
		mv.addObject("idList", list);

		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Vehicle bean) {

		dao.deleteVehicle(bean);

		ModelAndView mv = new ModelAndView("DeleteVehicleSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("UpdateVehicle")
	public ModelAndView loadUpdateEmployee() {
		ModelAndView mv = new ModelAndView("UpdateVehicle");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Vehicle bean) {

		ModelAndView mv = new ModelAndView();
		try {
			dao.updateVehicle(bean);
			mv.setViewName("UpdateVehicleSuccess");

		} catch (Exception e) {
			mv.setViewName("UpdateVehicleFail");

		}
		return mv;
	}

	@RequestMapping("FindVehicle")
	public ModelAndView loadFindEmployee() {
		List<Integer> list = dao.getIdList();
		ModelAndView mv = new ModelAndView("FindVehicle");
		mv.addObject("idList", list);

		return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute("bean") Vehicle bean) {

		Vehicle vec = dao.findVehicle(bean);

		ModelAndView mv = new ModelAndView("FindVehicleSuccess");
		mv.addObject("vec", vec);
		return mv;
	}

	@RequestMapping("FindAllVehicle")
	public ModelAndView loadFindAllEmployee() {
		List<Vehicle> vecList = dao.getAllVehicles();
		ModelAndView mv = new ModelAndView("FindAllVehicle");
		mv.addObject("idList", vecList);

		return mv;
	}

}
