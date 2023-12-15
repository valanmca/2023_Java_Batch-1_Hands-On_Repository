package com.dsrc.airline.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.aspectj.apache.bcel.Repository;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.dsrc.airline.bean.Airline;
import com.dsrc.airline.dao.AirlineDAO;
@Controller
public class ARSController {
	@Autowired
	AirlineDAO dao;
	
      @RequestMapping("/Start")
       public ModelAndView loadLandingPage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("LandingPage");
    	   return mv;
       }
       @RequestMapping("/Links")
       public ModelAndView loadLinksPage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("Links");
    	   return mv;
       }
       @RequestMapping("/InsertFlight")
       public ModelAndView loadInsertFlightPage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("InsertFlight");
    	   return mv;
       }
      @RequestMapping("/PerformInsert")
       public ModelAndView performInsert(Airline air)
       {
    	   ModelAndView mv= new ModelAndView();
    	   dao.save(air);
    	   mv.setViewName("InsertFlightSuccess");
    	   mv.addObject("bean",air);
    	   return mv;
       }
       @RequestMapping("/UpdateFlight")
       public ModelAndView loadUpdateFlightPage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("UpdateFlight");
    	   return mv;
       }
       @RequestMapping("/PerformUpdate")
   	public ModelAndView performUpdate(Airline bean) {
   	ModelAndView mv = new ModelAndView("UpdateFlightSuccess");
   	dao.save(bean);
   	mv.addObject("bean", bean);
   	return mv;
       }
       
   @RequestMapping("/PerformDelete")
   	public ModelAndView performDelete(Airline bean) {
   	    ModelAndView mv =new ModelAndView("DeleteFlightSuccess");
   	    dao.delete(bean);
   	    mv.addObject("bean", bean);
   	    return mv;
   	}
   	
    @RequestMapping("/DeleteFlight")
       public ModelAndView loadDeleteFlightPage()
       {
    	   ModelAndView mv= new ModelAndView();
    	   mv.setViewName("DeleteFlight");
    	   return mv;
       }

	@RequestMapping("/FindFlight")
	public ModelAndView loadFindFlight() {
	    ModelAndView mv =new ModelAndView();
	    mv.setViewName("FindFlight");
	    return mv;
	}

	@RequestMapping("/PerformFind")
	public ModelAndView performFind(String flightno) {
	    Airline air = dao.findByflightno(flightno);
	    ModelAndView mv =new ModelAndView("FindFlightSuccess");
	    mv.addObject("air",air);
	    return mv;
	}

	@RequestMapping("/FindAllFlightSuccess")
	public ModelAndView loadFindAllFlightSuccess() {
	    Iterator<Airline> it = dao.findAll().iterator();
	    String temp = "";
	    while(it.hasNext())
	    {
	    	Airline e = it.next();
	    	temp += "<tr><td>"+e.getFlightno()+"</td><td>"+e.getFlighttype()+"</td><td>"+e.getSource()+"</td><td>"+e.getDestination()+"</td><td>"+e.getEconomyseatscount()+"</td><td>"+e.getBusinessseatscount()+"</td><td>"+e.getEconomyfare()+"</td><td>"+e.getBusinessfare()+"</td></tr>";
	    }
	    ModelAndView mv =new ModelAndView();
	    mv.addObject("temp",temp);
	    mv.setViewName("FindAllFlightSuccess");
	    return mv;
	}
	/*@RequestMapping("/FindEmployeeByName")
	public ModelAndView loadFindEmployeeByName(Airline emp) {
	    ModelAndView mv =new ModelAndView();
	    mv.setViewName("FindEmployeeByName");
	    return mv;
	}

	@RequestMapping("/PerformFindByName")
	public ModelAndView performFindByName(String name) {
	    Airline emp = dao.findByName(name);
	    ModelAndView mv =new ModelAndView("FindEmployeeSuccess");
	    mv.addObject("emp",emp);
	    return mv;
	}*/
}
