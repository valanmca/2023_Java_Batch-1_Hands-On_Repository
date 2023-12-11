package com.sara;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sara.bean.Movies;
import com.sara.dao.MoviesDAO;

@Controller
public class MMSController {
	
	@Autowired
	MoviesDAO dao;
	
	@RequestMapping("Links")
    public ModelAndView loadLinks()
    {
       ModelAndView mv = new ModelAndView("Links");
        return mv;
    }
	
	@RequestMapping("Welcome")
    public ModelAndView loadWelcome()
    {
       ModelAndView mv = new ModelAndView("Welcome");
        return mv;
    }
	
	@RequestMapping("Navbar")
    public ModelAndView loadNavbar()
    {
       ModelAndView mv = new ModelAndView("Navbar");
        return mv;
    }
	
	
	 @RequestMapping("InsertMovie")
	    public ModelAndView loadInsertMovie()
	    {
	        ModelAndView mv=new ModelAndView("InsertMovie");
	        return mv;
	    }
	    
	    @RequestMapping("PerformInsert")
	    public ModelAndView performInsertEmployee(@ModelAttribute("bean") Movies bean)
	    {
	    	dao.insertMovie(bean);
	        ModelAndView mv=new ModelAndView("InsertMovieSuccess");
	        mv.addObject("bean",bean);
	        return mv;
	    }
    
	    @RequestMapping("UpdateMovie")
	    public ModelAndView loadUpdateMovie()
	    {
	        ModelAndView mv=new ModelAndView("UpdateMovie");
	        return mv;
	    }
	    
	    @RequestMapping("PerformUpdate")
	    public ModelAndView performUpdateEmployee(@ModelAttribute("bean") Movies bean)
	    {
	    	dao.updateMovie(bean);
	        ModelAndView mv=new ModelAndView("UpdateMovieSuccess");
	        mv.addObject("bean",bean);
	        return mv;
	    }
	    
	    
	    
	    @RequestMapping("DeleteMovie")
	    public ModelAndView loadDeleteMovie()
	    {
	    	List<Integer> list = dao.getIdList();
	        ModelAndView mv=new ModelAndView("DeleteMovie");
	        mv.addObject("idList", list);
	        return mv;
	    }
	    
	    @RequestMapping("PerformDelete")
	    public ModelAndView performDeleteEmployee(@ModelAttribute("bean") Movies bean)
	    {
	    	dao.deleteMovie(bean);
	        ModelAndView mv=new ModelAndView("DeleteMovieSuccess");
	        mv.addObject("bean",bean);
	        return mv;
	    }
	    
	    @RequestMapping("FindMovie")
	    public ModelAndView loadFindMovie()
	    {
	    	List<Integer> list = dao.getIdList();
	        ModelAndView mv=new ModelAndView("FindMovie");
	        mv.addObject("idList", list);
	        return mv;
	    }
	    
	    @RequestMapping("PerformFind")
	    public ModelAndView performFindEmployee(@ModelAttribute("bean") Movies bean)
	    {
	    	Movies movie = dao.findMovie(bean);
	        ModelAndView mv=new ModelAndView("FindMovieSuccess");
	        mv.addObject("bean",movie);
	        return mv;
	    }
	    
	    @RequestMapping("FindAllMovies")
	    public ModelAndView loadFindAllMovie()
	    {
	    	List<Movies> moviesList = dao.getMovies();
	        ModelAndView mv=new ModelAndView("FindAllMovies");
	        mv.addObject("idList", moviesList);
	        return mv;
	    }
	    
	    
    

}
