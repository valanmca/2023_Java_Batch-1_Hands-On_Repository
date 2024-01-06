package com.vms;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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

	@RequestMapping("A")
	public ModelAndView loadA() {
		ModelAndView mv = new ModelAndView("A");
		return mv;
	}
	
	@RequestMapping("InsertVehicleFail")
	public ModelAndView loadInsertVehicleFail() {
		ModelAndView mv = new ModelAndView("InsertVehicleFail");
		return mv;
	}
	
	@RequestMapping("Error")
	public ModelAndView loadError() {
		ModelAndView mv = new ModelAndView("Error");
		return mv;
	}
	
	@RequestMapping("Welcome")
	public ModelAndView loadWelcome() {
		ModelAndView mv = new ModelAndView("Welcome");
		return mv;
	}
	
	@RequestMapping("UpdateVehicleFail")
	public ModelAndView loadUpdateVehicleFail() {
		ModelAndView mv = new ModelAndView("UpdateVehicleFail");
		return mv;
	}
	
	@RequestMapping("InsertVehicle")
	public ModelAndView loadInsertVehicle() {
		ModelAndView mv = new ModelAndView("InsertVehicle");
		return mv;
	}

	@RequestMapping("DeletevehicleFail")
	public ModelAndView loadDeleteVehicleFail() {
		ModelAndView mv = new ModelAndView("DeleteVehicleFail");
		return mv;
	}
	
	@RequestMapping("PerformInsert")
	public ModelAndView performInsert(@ModelAttribute("bean") Vehicle bean) throws Exception {
try
{
		dao.insertVehicle(bean);
			ModelAndView mv = new ModelAndView("InsertVehicleSuccess");
			mv.addObject("bean", bean);
			return mv;
}
catch(Exception e)
{
	ModelAndView mv = new ModelAndView("InsertVehicleFail");
	return mv;
}

	}
	
	 /*@RequestMapping("PerformSearch")
	 public String print(String e, HttpServletRequest servletRequest, HttpServletResponse servletResponse) throws ServletException, IOException
	 {
	     String path = servletRequest.getParameter("e");
	     return path;
	 }*/
	@RequestMapping("PerformSearch")
	public void path(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String list = request.getParameter("e");
		if(list.equalsIgnoreCase("Insert Vehicle"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/InsertVehicle.jsp");
			rd.forward(request,response);
		}
		if(list.equalsIgnoreCase("Update Vehicle"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/UpdateVehicle.jsp");
			rd.forward(request,response);
		}
		if(list.equalsIgnoreCase("Delete Vehicle"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/DeleteVehicle.jsp");
			rd.forward(request,response);
		}
		if(list.equalsIgnoreCase("Find Vehicle"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/FindVehicle.jsp");
			rd.forward(request,response);
		}
		if(list.equalsIgnoreCase("Find All Vehicle"))
		{
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/FindAllVehicle.jsp");
			rd.forward(request,response);
		}
		else
		{
			RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/Views/Error.jsp");
			rd.forward(request, response);
		}
	}
	
	@RequestMapping("UpdateVehicle")
	public ModelAndView loadUpdateVehicle() {
		ModelAndView mv = new ModelAndView("UpdateVehicle");
		return mv;
	}

	@RequestMapping("PerformUpdate")
	public ModelAndView performUpdate(@ModelAttribute("bean") Vehicle bean) {
try
{
	dao.updateVehicle(bean);
	ModelAndView mv = new ModelAndView("UpdateVehicleSuccess");
	mv.addObject("bean", bean);
	return mv;
}
catch(Exception e)
{
	ModelAndView mv = new ModelAndView("UpdateVehicleFail");
	return mv;
}
	}

	@RequestMapping("DeleteVehicle")
	public ModelAndView loadVehicleEmployee() {
	    List<Integer> list = dao.getIdList();
	    ModelAndView mv =new ModelAndView("DeleteVehicle");
	    mv.addObject("idList",list);
	    
	    return mv;
	}

	@RequestMapping("PerformDelete")
	public ModelAndView performDelete(@ModelAttribute ("bean") Vehicle bean) {
	    
	    dao.deleteVehicle(bean);
	    
	    ModelAndView mv =new ModelAndView("DeleteVehicleSuccess");
	    mv.addObject("bean", bean);
	    return mv;
	}

	@RequestMapping("FindVehicle")
	public ModelAndView loadFindVehicle() {
	    List<Integer> list = dao.getIdList();
	    ModelAndView mv =new ModelAndView("FindVehicle");
	    mv.addObject("idList",list);
	    
	    return mv;
	}

	@RequestMapping("PerformFind")
	public ModelAndView performFind(@ModelAttribute ("bean") Vehicle bean) {
	    
		Vehicle emp = dao.findVehicle(bean);
	    
	    ModelAndView mv =new ModelAndView("FindVehicleSuccess");
	    mv.addObject("emp", emp);
	    return mv;
	}

	@RequestMapping("FindAllVehicle")
	public ModelAndView loadFindAllEmployee() {
	    List<Vehicle> list = dao.getFindAllVehicle();
	    ModelAndView mv =new ModelAndView("FindAllVehicle");
	    mv.addObject("idList",list);
	    
	    return mv;
	}
}
