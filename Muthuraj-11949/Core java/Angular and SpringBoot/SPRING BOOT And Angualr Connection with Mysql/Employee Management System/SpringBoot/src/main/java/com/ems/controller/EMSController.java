
package com.ems.controller;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
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
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.ems.bean.Employee;
import com.ems.dao.EmployeeDAO;
@RestController
@CrossOrigin("http://localhost:4200/")
public class EMSController {	
	@Autowired
	EmployeeDAO dao;
//	
//	@RequestMapping("/start")
//	public ModelAndView loadLandingPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("StartingPage");
//		return mv;
//	}
//	
//	
//	@RequestMapping("/Links")
//	public ModelAndView loadLinksPage() {
//		ModelAndView mv = new ModelAndView();
//		mv.setViewName("Links");
//		return mv;
//	}
	
//	@RequestMapping("InsertEmployee")
//	public ModelAndView loadInsertEmployee() {
//		ModelAndView mv = new ModelAndView("InsertEmployee");
//        mv.setViewName("InsertEmployee");
//
//		return mv;
//	}	
//	
	@PostMapping("/PerformInsert")
    public void performInsert(@RequestBody Employee emp) {
        dao.save(emp);  
    }
	


@PutMapping("/PerformUpdate")
public void performUpdate(@RequestBody Employee emp) {
    dao.save(emp);  
}


@DeleteMapping("/PerformDelete/{id}")
public void performDelete(@PathVariable("id") int id) {
    dao.deleteById(id);  
}


@GetMapping("/ViewAll")
public List<Employee> getAllEmployee() {
	System.out.println("Inside view All");
    Iterator<Employee> it=dao.findAll().iterator();
    List<Employee> list=new ArrayList<Employee>();
    while(it.hasNext()) {
    	list.add(it.next());
    }
	return list;  
}
}
	
	//UPDATE:
	
//	@RequestMapping("UpdateEmployee")
//	public ModelAndView loadUpdateEmployee() {
//		ModelAndView mv = new ModelAndView("UpdateEmployee");
//        mv.setViewName("UpdateEmployee");
//
//		return mv;
//	}	
//	@RequestMapping("/PerformUpdate")
//    public ModelAndView performUpdate(Employee emp) {
//        ModelAndView mv = new ModelAndView();
//        dao.save(emp);
//        mv.setViewName("UpdateEmployeeSuccess");
//        mv.addObject("bean", emp);
//        return mv;
//}
//	@RequestMapping("/DeleteEmployee")
//    public ModelAndView loaddeleteEmployeePage() {
//        ModelAndView mv = new ModelAndView();
//        mv.setViewName("DeleteEmployee");
//        return mv;
//    }
//    @RequestMapping("/PerformDelete")
//    public ModelAndView  performdeleteEmployee(Employee emp) {
//        dao.delete(emp);
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("DeleteEmployeeSuccess");
//        mv.addObject("bean", emp);
//        return mv;
//    }
//	// FindParticular ID:
//	@RequestMapping("FindEmployeee")
//	public ModelAndView loadFindPatient() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("FindPatient");
//		return mv;
//	}
//	
//	@RequestMapping("/PerformFind")
//    public ModelAndView  performfindEmployee(Employee bean ) {
//        Optional<Employee> emp=dao.findById(bean.getEmpid());
//        ModelAndView mv=new ModelAndView();
//        mv.setViewName("FindEmployeeSuccess");
//        mv.addObject("bean",emp);
//        return mv;
//    }
//	@RequestMapping("FindAllEmployee")
//    public ModelAndView loadFindEmployee() {
//        Iterator<Employee> it =  dao.findAll().iterator();
//        
//        String temp = "";
//        while(it.hasNext()) {
//            Employee e = it.next();
//            temp += "<tr><td>"+e.getEmpid()+"</td><td>"+e.getName()+"</td><td>"+e.getSalary()+"</td></tr>";
//        }
//        ModelAndView mv=new ModelAndView();
//        mv.addObject("temp",temp);
//        mv.setViewName("FindAllEmployee");
//        return mv;
//    }}