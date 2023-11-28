package com.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class FirstFilter
 */
@WebFilter("/addAlien")       // Filter is an Interface belongs to servelt API
public class FirstFilter implements Filter {

    
	public void destroy() {
		
	}

	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out=response.getWriter();
		
		HttpServletRequest req=(HttpServletRequest) request;
		int aid=Integer.parseInt(request.getParameter("id"));
		
		if(aid >= 1)
		{
			chain.doFilter(request, response);
		}
		else
		{
			out.println("Invalid Input");
		}
		
	}

	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}

}
