package com.domnic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.domnic.bean.Vehicle;
import com.domnic.dao.VehicleDAO;

@Controller
public class VMSController {

	@Autowired
	VehicleDAO dao;

	@RequestMapping("NavBar")
	public ModelAndView loadNavbar() {
		ModelAndView mv = new ModelAndView("NavBar");
		return mv;
	}

	@RequestMapping("LandingPage")
	public ModelAndView loadLandingPage() {
		ModelAndView mv = new ModelAndView("LandingPage");
		return mv;
	}

	@RequestMapping("Links")
	public ModelAndView loadLinks() {
		ModelAndView mv = new ModelAndView("Links");
		return mv;
	}

	@RequestMapping("InsertVehicle")
	public ModelAndView loadInsertVehicle() {
		ModelAndView mv = new ModelAndView("InsertVehicle");
		return mv;
	}

	@RequestMapping("PerformInsert")
    public ModelAndView performInsert(@ModelAttribute("bean") Vehicle bean)
    {
        ModelAndView mv=new ModelAndView();
        
        try {
            dao.insertVehicle(bean);
            
            mv.addObject("value",bean);
            mv.setViewName("InsertVehicleSuccess");
            
            
        }catch(Exception e)
        {
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

	@RequestMapping("DeleteVehicle")
	public ModelAndView loadDeleteVehicle() {
		List<Integer> list = dao.getIdList();

		ModelAndView mv = new ModelAndView("DeleteVehicle");
		mv.addObject("idList", list);
		return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView PerformDelete(@ModelAttribute("bean") Vehicle bean) {
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
	public ModelAndView PerformFind(@ModelAttribute("bean") Vehicle bean) {
		Vehicle stu = dao.findVehicle(bean);
		ModelAndView mv = new ModelAndView("FindVehicleSuccess");
		mv.addObject("bean", stu);
		return mv;
	}

	@RequestMapping("FindAllVehicle")
	public ModelAndView loadFindAllVehicle() {
		List<Vehicle> List = dao.getVehicle();
		ModelAndView mv = new ModelAndView("FindAllStudent");
		mv.addObject("idList", List);
		return mv;
	}

}
