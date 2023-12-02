package com.muthu;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.muthu.bean.Addition;
import com.muthu.bean.Employee1;
@Controller    
public class MyController {		    
	@RequestMapping("Welcome")
    public ModelAndView sayWelcome() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Welcome");
		return mv;		
	}
	@RequestMapping("Hello")
	public ModelAndView sayHello() {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("Hello");
		return mv;
	}
	@RequestMapping("Calc")
	public String Calculator() {
	return "Calculator";
	}
    @RequestMapping("Calculator")
   	public String SumCalculator(HttpServletRequest request, HttpServletResponse response){
        // ModelAndView mv=new ModelAndView(); 	
 		String action=request.getParameter("fn"); 
 
    	int x= Integer.parseInt(request.getParameter("num1"));
         int y=Integer.parseInt(request.getParameter("num2"));
        // int sum=x+y;
         
         if(action.equals("Subtraction")) {
 	    	int sum=x-y;
 	         request.setAttribute("sum",sum); 
 	         }
         if(action.equals("Addition")) {
  	    	int sum=x+y;
  	         request.setAttribute("sum",sum);
  	         }
         if(action.equals("multiplication")) {
  	    	int sum=x*y;
  	         request.setAttribute("sum",sum); 
  	         }
         if(action.equals("division")) {
   	    	int sum=x/y;
   	         request.setAttribute("sum",sum);
   	        	 }
         return "Calculator";	 
          }  
    @RequestMapping("Input")
	public ModelAndView callInputPage() {
		ModelAndView mv=new ModelAndView("Input");
		return mv;
	}  
    @RequestMapping("Addition")
   	public ModelAndView performAddition(@ModelAttribute("addition") Addition addition) {
   		ModelAndView mv=new ModelAndView("Result");
   		mv.addObject("bean", addition);
   		return mv;
   	}
   @RequestMapping("EmployeeInput")
     	public ModelAndView callEmployeeInputPage() {
   		ModelAndView mv=new ModelAndView("EmployeeInput");
   		return mv;
   	}  
@RequestMapping("AddEmployee")
    	public ModelAndView addEmployee(@ModelAttribute("employee") Employee1 employee) {
   		ModelAndView mv=new ModelAndView("EmployeeResult");
   		mv.addObject("emp",employee);
   		return mv;
   	}  
}