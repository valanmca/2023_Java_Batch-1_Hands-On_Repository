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

//	@RequestMapping("Links")
//	public ModelAndView loadLinks() {
//		ModelAndView mv = new ModelAndView("Links");
//		return mv;
//	}

	@RequestMapping("InsertVehicle")
	public ModelAndView loadInsertEmployee() {
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

	@RequestMapping("UpdateVehicle")
	public ModelAndView loadUpdateVehicle() {
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

	@RequestMapping("FindVehicle")
	public ModelAndView loadFindVehicle() {
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
		List<Vehicle> empList = dao.getVehicles();
		ModelAndView mv = new ModelAndView("FindAllVehicle");
		mv.addObject("idList", empList);
		return mv;
	}

}
