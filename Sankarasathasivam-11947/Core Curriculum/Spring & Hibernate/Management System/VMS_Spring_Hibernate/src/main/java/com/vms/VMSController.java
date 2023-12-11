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

	@RequestMapping("Front")
	public ModelAndView loadFront() {
		ModelAndView mv = new ModelAndView("Front");
		return mv;
	}

	@RequestMapping("InsertVehicle")
	public ModelAndView loadInsertVehicle() {
		ModelAndView mv = new ModelAndView("InsertVehicle");
		return mv;
	}

	@RequestMapping("performInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Vehicle bean) {

		ModelAndView mv = new ModelAndView("InsertVehicleSuccess");
		try {
			dao.insertVehicle(bean);

			mv.addObject("bean", bean);
			mv.setViewName("InsertVehicleSuccess");

		} catch (Exception e) {
			mv.setViewName("InsertVehicleFailed");
		}
		return mv;
	}

	@RequestMapping("UpdateVehicle")
	public ModelAndView loadUpdateVehicle() {
		ModelAndView mv = new ModelAndView("UpdateVehicle");
		return mv;
	}

	@RequestMapping("performUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Vehicle bean) {

		dao.updateVehicle(bean);
		ModelAndView mv = new ModelAndView("UpdateVehicleSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("DeleteVehicle")
	public ModelAndView loadDeleteVehicle() {
		List<Integer> list = dao.getIdList();

		ModelAndView mv = new ModelAndView("DeleteVehicle");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("performDelete")
	public ModelAndView performDelete(@ModelAttribute("bean") Vehicle bean) {
		dao.deleteVehicle(bean);
		ModelAndView mv = new ModelAndView("DeleteVehicleSuccess");
		mv.addObject("bean", bean);
		return mv;
	}

	@RequestMapping("FindVehicle")
	public ModelAndView loadFindVehicle() {
		List<Integer> list = dao.getIdList();

		ModelAndView mv = new ModelAndView("FindVehicle");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("performFind")
	public ModelAndView performFind(@ModelAttribute("bean") Vehicle bean) {
		Vehicle stu = dao.findVehicle(bean);
		ModelAndView mv = new ModelAndView("FindVehicleSuccess");
		mv.addObject("bean", stu);
		return mv;
	}

	@RequestMapping("FindAllVehicle")
	public ModelAndView loadFindAllVehicle() {
		List<Vehicle> List = dao.getVehicle();
		ModelAndView mv = new ModelAndView("FindAllVehicle");
		mv.addObject("idList", List);
		return mv;
	}
}
