package com.madhan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.madhan.bean.Employee;

@Controller
public class MyController {

	@RequestMapping("EmployeeInput")
    public ModelAndView callEmployeeInputPage() {
        ModelAndView mv = new ModelAndView("EmployeeInput");
        return mv;
    }
    
    @RequestMapping("AddEmployee")
    public ModelAndView addEmployee(@ModelAttribute("employee") Employee employee) {
        ModelAndView mv = new ModelAndView("EmployeeResult");
        mv.addObject("emp", employee);
        return mv;
    }
}
