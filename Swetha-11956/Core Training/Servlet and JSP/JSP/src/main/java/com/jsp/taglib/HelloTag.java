package com.jsp.taglib;
import javax.servlet.jsp.*;
import javax.servlet.jsp.tagext.SimpleTagSupport;

import java.io.*;


public class HelloTag extends SimpleTagSupport{
	private String message;

//	public String getMessage() {
//		return message;
//	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void doTag() throws JspException,IOException{
		
		if(message!=null) {
			JspWriter out=getJspContext().getOut();
			out.println(message);
		}
		else {
			
		}
		
		//JspWriter out=getJspContext().getOut();
		//out.println("Hello Custom Tag!");
		
		

	}

}
